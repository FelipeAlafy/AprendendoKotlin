package Days.day4

fun main() {
    val pessoa = Person("Felipe Alafy Rodrigues Silva")
    println(pessoa.name)
    val square = Square(40, 40)
    println("Uma forma com 40 de largura e 40 de altura é um quadrado?\n${square.isSquare}")
}