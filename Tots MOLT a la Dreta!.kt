import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    var strikes = 0
    var videos = 0


    while (strikes < 3){
         var numero = scanner.nextInt()

        if (numero == -1){
            strikes++
        }else{
            videos++
        }
    }
    println(videos)
}