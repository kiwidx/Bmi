package com.example.bmi

fun main(){
    val p = Person()
    p.hello()
    //variable
    var age: Int = 10
    val weight :Float =64.5f
    val height = 1.7f
    val bmi = weight/(height*height)
    println(bmi)
    val isAdult = true
    var name: String? = null
    //name = "Hank"
    println(name?.uppercase())
}
class Hello {
}