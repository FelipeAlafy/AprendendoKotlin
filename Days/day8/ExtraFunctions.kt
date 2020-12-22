package Days.day8

//Cap 3, livrando-se das classes para funções e propriedades

var count = 0; //Propriedade de nível superior

fun <T> joinToString(
        collection: Collection<T>,
        separetor:String = ", ",
        prefix:String = "",
        postfix:String = ""
):String{
    count++
    var rs = StringBuilder(prefix)
    for ((index, elements) in collection.withIndex()) {
        if (index > 0) rs.append(separetor)
        rs.append(elements)
    }
    rs.append(postfix)
    println(timesJoinToStringCalled())
    return rs.toString()
}

fun timesJoinToStringCalled() = count