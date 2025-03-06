import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    var contadorNombres = mutableMapOf<String,Int>() //Mapa para contar las veces que aparece cada palabra

    var nombre = scanner.nextLine()

    var ganador = "" //Varibale para guardar el nombre ganador
    var encontrado = false


    while (nombre != "xxx") { //El bucle no termina hasta que se introduzca "xxx"

        contadorNombres[nombre] = contadorNombres.getOrDefault(nombre, 0) + 1


        //Hacemos un condicional para comprobar quien a ganado
        if (contadorNombres[nombre] ==5 && !encontrado) {
            ganador = nombre
            encontrado = true
        }

        nombre = scanner.nextLine() //Leemos el siguiente nombre
    }

    //Imprimir resultado
    if (encontrado) {
        println(ganador)
    } else {
        println("NO")
    }
}
