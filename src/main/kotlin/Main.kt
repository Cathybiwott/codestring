fun main() {
    val word= "akirachix"
    println(charArrayOf(word[0],word[2],word[3]))
    val text = "Cathy"
    val text2 = "Mary"
    if (text.equals(text2)){
        println("THats me!")}else{
        println("I don't know who that is")}
    println(noOfStrings())
    println(stmt())
}



fun stmt():String{
    val name = "Cathy"
    val age = "20"
    val stmt= "Hi my name is $name and I am $age years old"
    return(stmt)
}

fun noOfStrings():Int{
    val noString = "teacher"
    val len = noString.length
    return len

}
