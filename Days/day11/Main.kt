package Days.day11

fun main() {
    val texto = "703.025.676-07"
    println("Regex: ${texto.split("\\.|-".toRegex())}")
    println("Texto: ${texto.split(".", "-")}")
    val path = "/home/falaf/kotlin.kt"
    val dir = path.substringBeforeLast("/")
    val user = path.substringAfterLast("/")
    val file = path.substringBeforeLast(".")
    val extension = path.substringAfterLast(".")
    println("Dir: $dir User: $user File: $file, Extension: $extension")
}