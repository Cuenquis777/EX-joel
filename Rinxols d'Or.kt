import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosProva = scanner.nextInt() // Número de casos de prueba
    scanner.nextLine()

    repeat(casosProva) {

        val tamanyo = scanner.nextInt() // Tamaño del array
        val array = IntArray(tamanyo)  // Creamos el array

        //Hacemos un bucle para meter los numeros dentro del array
        for (i in 0 until tamanyo) {
            array[i] = scanner.nextInt()
        }

        val numDesplazamiento = scanner.nextInt() //Numero de desplazamiento

        val newArray = IntArray(tamanyo) // Creamos un nuevo array para almacenar los resultados

        val desplazamiento = numDesplazamiento % tamanyo // operacion de desplazamiento


        //Desplazamos los elementos del array
        for (i in 0 until tamanyo) {
            val posicionDesplazamiento = (i + desplazamiento) % tamanyo
            newArray[posicionDesplazamiento] = array[i]
        }
        println(newArray.joinToString(" "))
    }
}
