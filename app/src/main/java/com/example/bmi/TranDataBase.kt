package com.example.bmi

import androidx.room.Database

@Database(entities = arrayOf(Transaction::class), version = 1)
abstract class TranDataBase {
    abstract fun transactionDao(): TransactionDao
}