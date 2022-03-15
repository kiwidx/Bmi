package com.example.bmi

class Student constructor(
    var name: String,
    var english: Int,
    var math: Int){
    //Fields
    fun print(){
        println("$name\t$english\t$math\t${average()}")
    }
    fun average(): Int{
        return (english+math)/2
    }

    fun main(){
        val jack = Student("Jack", 85, 65)
        jack.print()
    }
}