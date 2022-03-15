package com.example.bmi

interface Report {
    fun print()
}

class FinanceReport: Report{
    override fun print() {
        println("Finance")
    }
}

fun main(){
    val financeReport = FinanceReport()
    financeReport.print()
    //anonymous class
    object : Report{
        override fun print(){
            println("Health!!")
        }
    }

}