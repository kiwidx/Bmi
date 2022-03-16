package com.example.bmi

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val account: String,
    @ColumnInfo(name = "createAt")
    val date: String,
    @ColumnInfo(name = "amount")
    val amount: Int,
    val type: Int){

}