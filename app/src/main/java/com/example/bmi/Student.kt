package com.example.bmi

class Student(var name: String,
    var english: Int,
    var math: Int){
    //null constructor
    constructor(): this("", 0,0){
        println("Hi")
    }
    constructor(name: String): this(name,0,0)
    //Fields
    fun print(){
        println("$name\t$english\t$math\t${average()}")
    }
    fun average(): Int{
        return (english+math)/2
    }

    fun main(){
        val hank = Student("Hank")
        val jack = Student("Jack", 85, 65)
        jack.print()
    }
}