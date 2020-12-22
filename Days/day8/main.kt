package Days

import Days.day8.joinToString
import Days.day8.timesJoinToStringCalled

fun main() {
    //Day8
    val nomes = ArrayList<String>()
    for (nome in nomes.size .. 3) {
        print("Digite o nome ${nomes.size + 1}/10: ")
        nomes.add(readLine()!!)
    }

    val values = ArrayList<Int>()

    for (value in values.size .. 3) {
        print("Digite a Idade dessas pessoas ${values.size + 1}/10: ")
        values.add(readLine()!!.toInt())
    }

    println(joinToString(collection = nomes))
    println(joinToString(collection = values, separetor = ", ", prefix = "[", postfix = "]"))
    println(timesJoinToStringCalled())
}