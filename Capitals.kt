import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosProva = scanner.nextInt() // Número de casos de prueba
    scanner.nextLine()

    repeat(casosProva) {

        val numPaises = scanner.nextInt() //Numero de paises
        scanner.nextLine()

        val paisCapitalMapa = HashMap<String, String>() //HashMap para almacenar los países y sus capitales

        //Hacemos un bucle para agregar los países y sus capitales
        for (i in 1..<numPaises) {
            var nombrePais = scanner.nextLine()
            var separacion = nombrePais.split("-") //Separamos el nombre del país y su capital

            val pais = separacion[0]
            val capital = separacion[1]
            paisCapitalMapa[pais] = capital //Agregamos al HashMap
        }

        val capitalBuscada = scanner.nextLine().uppercase() //Capital buscada

        println(paisCapitalMapa)

        var paisEncontrado = ""
        for ((pais, capital) in paisCapitalMapa) { //Buscamos el país con la capital buscada
            if (capital == capitalBuscada) {
                paisEncontrado = pais
            }
        }
        println(paisEncontrado)
    }
}
