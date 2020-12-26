package Days.day9
import Days.day9.lastChar as lastCharWithEnum

fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!.toString()
    println(nome.lastCharWithEnum())
    val set = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(set.joinToString(postfix = ")", separator = "; ", prefix = "("))
}
