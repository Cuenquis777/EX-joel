import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val numLineas = scanner.nextInt()
    scanner.nextLine()

    val diferencialRoto = scanner.nextLine().trim()
    val listaDiferencial = mutableMapOf<String, Boolean>() //Lista que agregaremos los diferenciales

    repeat(numLineas -1) {

        val diferencial = scanner.nextLine().trim()

        if (diferencial == diferencialRoto) {
            //Si se activa el diferencial espatllat, todos se ponen en false
            listaDiferencial.keys.forEach() { listaDiferencial[it] = false }
        } else {
            // Alternar el estado del diferencial
            listaDiferencial[diferencial] = !(listaDiferencial[diferencial] ?: false)
        }
    }

    val activos = listaDiferencial.count { it.value } //Diferenciales en true
    val inactivos = listaDiferencial.size - activos //Diferenciales en false

    println("$activos $inactivos")
}
