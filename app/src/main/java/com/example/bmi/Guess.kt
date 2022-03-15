package com.example.bmi

import kotlin.random.Random

fun main(){
    val secret = Random.nextInt(10)+1
    println(secret)
    var  num = 0
    while (num != secret){
        println("Please input a number(1~10):")
        if(num > secret) println("Smaller")
        else if(num < secret) println("Bigger")
        else println("You got it")
    }
}
class Guess {
}