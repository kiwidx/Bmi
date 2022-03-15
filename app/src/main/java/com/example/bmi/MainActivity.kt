package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.bmi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var secret = (1..10).random()
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        /*val inputNumber = findViewById<EditText>(R.id.number)
        val  data = inputNumber.text.toString()*/
        Log.d("MainActivity", "secret: $secret")
    }
    fun guess(view: View){
        counter++
        //將counter顯示跟tvcounter binding
        binding.tvcounter.text = counter.toString()
        val num = binding.number.text.toString().toInt()
        val message = if(num < secret) "Bigger"
            else if (num > secret) "Smaller"
            else{
                secret = (1..10).random()
                counter = 0
                "You got it!"
        }
        AlertDialog.Builder(this)
            .setTitle("Guess")
            .setMessage(message)
            .setPositiveButton("OK"){ d, w->

            }
            .show()
    }
}