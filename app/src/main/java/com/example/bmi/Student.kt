package com.example.bmi
//change final to open
open class Student(var name: String,
                   var english: Int,
                   var math: Int){
    companion object{
        var pass =60
        fun test(){

        }
    }
    //null constructor
    constructor(): this("", 0,0){
        println("Hi")
    }
    constructor(name: String): this(name,0,0)
    //Fields
    fun print(){
        println("$name\t$english\t$math\t${average()}")
        //不及格做記號
        if (average() < pass) println("*") else println()
    }
    fun average() = (english+math)/2

    fun max(a: Int,b: Int) = if(a > b) a else b
    fun highest() = if(english > math) english else math
    fun grading() = when(average()/10){
        in 9..10 -> 'A'
        8 -> 'B'
        7 -> 'C'
        6 -> 'D'
        else -> 'F'

    }

    fun main(){
        val hank = Student("Hank", 60, 40)
        val jack = Student("Jack", 85, 65)
        jack.print()
    }
}