import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosProva = scanner.nextInt() // Número de casos de prueba
    scanner.nextLine()

    repeat(casosProva) {

        val numTareas = scanner.nextInt() //Numero de tareas
        val encontrarTarea = scanner.nextInt() //Numero de tarea que queremos saber
        scanner.nextLine()

        val lista = mutableListOf<Pair<Int, String>>() //Lista para almacenar las tareas

        //Hacemos un bucle para añadir las tareas al listado
        repeat(numTareas) {
            val linea = scanner.nextLine().split(" ", limit = 2)

            val numTarea = linea[0].toInt() //Numero de la tarea
            val nombreTarea = linea[1] //Nombre de la tarea

            lista.add(Pair(numTarea, nombreTarea)) //Agregamos la tarea al listado
        }

        //Ordenamos la lista por prioridad
        val listaOrdenada = lista.sortedBy { it.first }

        //Buscamos la tarea con el número
        println(listaOrdenada[encontrarTarea -1].second)
    }
}
