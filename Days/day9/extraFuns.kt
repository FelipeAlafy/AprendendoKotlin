package Days.day9

import java.lang.StringBuilder

fun String.lastChar():Char = this[this.length - 1]

fun <T> Collection<T>.joinToString(
        separator:String = " ",
        prefix:String = "[",
        posfix:String = "]"
):String{
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(posfix)
    return result.toString()
}