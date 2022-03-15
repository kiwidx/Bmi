package com.example.bmi

class NumberGame {
    var secret : Int = 0
    var counter = 0
    var end = false
    init {
        reset()
    }
    fun reset() {
        secret = (1..10).random()
        counter = 0
        end = false
    }
    fun guess(num: Int) : String {
        counter++
        val message = if (num > secret) "Smaller"
        else if (num < secret) "Bigger"
        else {
            end = true
            "You got it"
        }
        return message
    }
}