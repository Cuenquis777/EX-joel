import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val casosProva = scanner.nextInt() // Número de casos de prueba
    scanner.nextLine()

    repeat(casosProva) {

        val palabra = scanner.nextLine() //Cadena de paréntesis para cada caso
        var contador = 0
        var encontrado = true

        // Hacemos un bucle para recorrer toda la palabra
        for (letra in palabra) {
            if (letra == '(') { //Si encontramos el signo ( incrementamos el contador
                contador++
            } else if (letra == ')') { //Si encontramos el signo ) decrementamos el contador
                contador--
            }
            if (contador < 0) {
                encontrado = false
            }
        }

        // Si al final el contador no es 0, significa que hay paréntesis no cerrados
        if (contador != 0) {
            encontrado = false
        }
        println(if (encontrado) "si" else "no")
    }
}
