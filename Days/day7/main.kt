package Days.day7

import Days.day6.joinToString
import Days.day7.Auxiliar
import java.lang.StringBuilder

fun main() {
    val ax = Auxiliar()
    val elements = arrayListOf(1, 2, 3, 4, 5)
    println(joinToString(collection = elements, prefix = "<", postFix = ">"))
    println(ax.joinToString(collection = elements))
}

fun <T> joinToString(
        collection: Collection<T>,
        separetor:String = ", ",
        prefix:String = "",
        postFix:String = ""
):String{
    val text = StringBuilder(prefix)
    for ((indice, elemento) in collection.withIndex()) {
        if(indice > 0) text.append(separetor)
        text.append(elemento)
    }
    text.append(postFix)
    return text.toString()
}