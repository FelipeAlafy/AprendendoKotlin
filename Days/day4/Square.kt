package Days.day4

class Square (val larg:Int, val alt:Int){
    val isSquare:Boolean
        //get() = larg == alt
        get(){
            return larg == alt
        }
}