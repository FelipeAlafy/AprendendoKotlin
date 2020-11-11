// Day 0 - Person Class Example of The Book Kotlin in action.
package Days.day0

data class Person (val name:String, val age:Int? = null)

fun main(){
    val persons = listOf(Person("Anderson"),
                        Person("Felipe Alafy", 15),
                        Person("Samantha", 34),
                        Person("Ronaldo", 20))
    val oldest = persons.maxBy { it.age ?: 0 }
    print("The oldest is $oldest")
}