package com.example.bmi
fun main(){
    val n = 30
     println((1..n).random())
    for (i in 2..9){
        for (j in 1..9){
            //中間的判斷式為了讓格式整齊
            println("$i*$j=${if(i*j < 10) "" else ""}${i*j}")
        }
    }
}

class Nine {
}