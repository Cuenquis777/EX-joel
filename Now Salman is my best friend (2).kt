import java.util.*
import kotlin.collections.HashMap

fun main() {
    val scanner = Scanner(System.`in`)

    //variable para leer la longuitud del cuadrado
    var casosProva = scanner.nextInt()
    scanner.nextLine()

    var nombreMapa = mutableMapOf<String, String>()

    repeat(casosProva) {
        val numLineas = scanner.nextInt()
        scanner.nextLine()

        repeat(numLineas -1) {
            val (persona1, persona2) = scanner.nextLine().split(" ")

            //Agregamos los nombres al mapa
            nombreMapa[persona1] = persona2
            nombreMapa[persona2] = persona1
        }

        //Buscamos el nombre
        val nombreBuscado = scanner.nextLine().trim()

        println(nombreMapa[nombreBuscado])
    }
}
