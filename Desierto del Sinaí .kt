import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosPrueba = scanner.nextInt() //Número de casos de prueba
    scanner.nextLine()

    repeat(casosPrueba){

        var numNombres = scanner.nextInt() //Numero de mapas
        scanner.nextLine()

        var mapas = HashMap<String, Int>()

        repeat(numNombres) {
            val nombreMapa = scanner.nextLine() //Nombre del mapa

            //Metemos el nombre dentro del mapa
            mapas[nombreMapa] = mapas.getOrDefault(nombreMapa, 0) + 1
        }
        //Buscamos el mapa mas votado
        val mapaMasVotado = mapas.maxByOrNull { it.value }?.key

        println(mapaMasVotado)
    }
}
