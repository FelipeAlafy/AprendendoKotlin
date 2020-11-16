package Days.day3
// Strings Templates
fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Mundo"
    println("Olá, ${name}!")
}