import java.util.*

fun main() {

    val scan = Scanner(System.`in`)

    //Variable de casos de prueba
    val numcasos = scan.nextInt()
    scan.nextLine()

    //Bucle de los casos de prueba
    repeat(numcasos) {

        //Hacemos una variable de cuantos aperitivos roba
        val roba = scan.nextInt()
        scan.nextLine()

        //Hacemos una variable que separará las frases y se meten en una lista mutable para poder modificarlas
        var frase = scan.nextLine().split(" ").toMutableList()

        //Creamos una lista que aquí se pondrán los aperitivos y solo es de Strings
        val aperitivos = mutableListOf<String>()

        //Bucle para recorrer la lista de aperitivos
        for (i in frase.indices) {

            //Si la posición no es múltiple de roba y es diferente de 0, no se roba el aperitivo
            if ((i + 1) % roba != 0) {
                //Si cumple con la condición, se agregará la frase a la lista
                aperitivos.add(frase[i])
            }
        }
        //Imprimimos el resultado
        println(aperitivos.joinToString(" "))
    }
}
