import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosPrueba = scanner.nextInt() //Número de casos de prueba
    scanner.nextLine()

    repeat(casosPrueba) {
        val numNombres = scanner.nextInt()
        scanner.nextLine()

        val mapGanadores = mutableMapOf<String, Int>() //Mapa para contar las victorias de los alias

        // Agregar los años y los alias a un mapa
        repeat(numNombres - 1) {
            val linea = scanner.nextLine()
            val partes = linea.split("-") //Separaramos el año y el alias

            val alias = partes[1]
            mapGanadores[alias] = mapGanadores.getOrDefault(alias, 0) + 1 //Incrementamos el contador para ese alias
        }

        val aliasBuscado = scanner.nextLine() //Alias que estamos buscando
        println(mapGanadores.getOrDefault(aliasBuscado, 0)) //Imprimir el número de victorias o "0" si no existe
    }
}
