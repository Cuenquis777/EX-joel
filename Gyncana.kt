import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosProva = scanner.nextInt() //Número de casos de prueba
    scanner.nextLine()

    repeat(casosProva) {

        var numNens = scanner.nextInt() //Numero de niños
        scanner.nextLine()


        val cola = mutableListOf<Int>() //Cola de niños

        for (i in 1..numNens) {
            cola.add(i)
        }

        var siguienteNiño = numNens + 1 //Cuando entra un nuevo niño, su número se incrementa

        val events = scanner.nextLine().uppercase() //Sequiencia de eventos

        for (event in events) { //Bucle para cada evento

            when (event) {
                'S' -> {
                    //El primer niño supera la prueba y se va
                    if (cola.isNotEmpty()) {
                        cola.removeAt(0)
                    }
                }

                'N' -> {
                    //El primer niño no supera la prueba y vuelve a la cola
                    if (cola.isNotEmpty()) {
                        val niño = cola.removeAt(0)
                        cola.add(niño)
                    }
                }

                'E' -> {
                    //Un nuevo niño entra en la cola con el siguiente número
                    cola.add(siguienteNiño)
                    siguienteNiño++
                }
            }
        }
        if (cola.isNotEmpty()) {
            println(cola.first()) // Imprimimos el numero del primer niño de la cola
        }
    }
}
