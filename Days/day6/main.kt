package Days.day6

import java.lang.StringBuilder
import javax.management.monitor.StringMonitor

fun main() {
    //Definindo coleções
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    println(set.last())
    println(list.last())
    println(map[map.size])
    println(joinToString(list, "; ", "(", ")"))
}

//O tipo <T> é o que permite que a função seja chamada independente de uma outra coisa como elements.last, aqui podemos usar o joinToString()
fun <T> joinToString(//Paramêtros
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}