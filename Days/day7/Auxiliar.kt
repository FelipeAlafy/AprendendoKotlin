package Days.day7

import java.lang.StringBuilder

class Auxiliar {
    @JvmOverloads
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
}