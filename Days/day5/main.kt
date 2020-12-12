package Days.day5

import java.util.*

fun main() {
    //Getting RGB
    println(Colors.INDIGO.rgb())
    val Auxiliar = Auxiliar()
    println(Auxiliar.getMnemonic(Colors.YELLOW))
    println(Auxiliar.getWarmth(Colors.BLUE))

    val map = hashMapOf(1 to "um", 7 to "sete", 53 to "cinquenta e três")
    val list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 53)

    println(map[list[0]])
    val map2 = TreeMap<Char, String>()
    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.toInt())
        map2[c] = binary
    }

    for ((i, c) in map2) {
        println("$i = $c")
    }

    println("A = ${Auxiliar.isLetter('2')}")

    //Tratamento de erros
    try {
        print("N1: ")
        val a = readLine()!!.toInt()
        print("N2: ")
        val b = readLine()!!.toInt()
        println(Auxiliar.sum(a, b))
    } catch (erro:NumberFormatException) {
        println("Não é um número")
    }
}