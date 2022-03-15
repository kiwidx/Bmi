package com.example.bmi

import kotlin.random.Random

fun main(){
    var min = 1
    var max = 100
    var secrect = Random.nextInt(100)+1
    var num = 0
    println(secrect)
    while (num != secrect){
        println("Please input a number between $min to $max")
        readLine()?.let {
            num = it.toInt()
            if(num < secrect) min = num
            else if(num > secrect) max = num
            else println("You got it,the secret number is $num!")
        }
    }
}

class Guess1To100 {
}