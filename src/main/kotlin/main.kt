
fun main (){
    var likes: Int = 43
    var peopleForm1: String = "людям"
    if (likes % 10 == 1 && likes % 100 !=11){
        peopleForm1 = "человеку"
    }

    println ("Понравилось $likes $peopleForm1")
}