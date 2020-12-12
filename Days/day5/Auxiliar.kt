package Days.day5

import Days.day5.Colors.*
import Days.day5.Colors

class Auxiliar {
    fun getMnemonic(color: Colors)= when (color) {
        Colors.RED -> "Ricardo"
        Colors.BLUE -> "Balão"
        Colors.ORANGE -> "Laranja"
        Colors.YELLOW -> "Ana"
        Colors.GREEN -> "Vaca"
        Colors.INDIGO -> "Irlanda"
        Colors.VIOLET -> "Vanila"
    }

    fun getWarmth(color: Colors) = when(color){
        RED, YELLOW, ORANGE -> "Quente"
        GREEN -> "natural"
        BLUE, INDIGO, VIOLET -> "Gelado"
    }

    fun isLetter(c:Char) = c in 'A'..'Z' || c == 'Ç'

    fun sum(n:Int, n2:Int): Int {
        return n + n2
    }
}