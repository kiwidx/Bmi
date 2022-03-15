package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.bmi.databinding.ActivityMainBinding

//The Controller, handle data changed state, UI, flow
class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding: ActivityMainBinding
    val game = NumberGame()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        /*val inputNumber = findViewById<EditText>(R.id.number)
        val  data = inputNumber.text.toString()*/
        //Log.d("MainActivity", "secret: $secret")
    }
    fun guess(view: View){
        //counter++
        //將counter顯示跟tvcounter binding
        //binding.tvcounter.text = counter.toString()
        Log.d(TAG, "Testing")
        val num = binding.number.text.toString().toInt()
        val state = game.guess(num)
        val message = when(state){
            NumberGame.GameState.BIGGER -> getString(R.string.bigger)
            NumberGame.GameState.SMALLER -> getString(R.string.smaller)
            NumberGame.GameState.BINGO -> getString(R.string.bingo)
            else -> getString(R.string.somehting_goes_wrong)
        }
        /*val message = if(num < secret) "Bigger"
            else if (num > secret) "Smaller"
            else{
                secret = (1..10).random()
                counter = 0
                "You got it!"
        }*/
        AlertDialog.Builder(this)
            .setTitle("Guess")
            .setMessage(message)
            .setPositiveButton(getString(R.string.OK)){ d, w->
                if(game.end) game.reset()
                updateUI()
            }
            .show()
        updateUI()
    }

    private fun updateUI(){
        binding.tvcounter.text = getString(R.string.counter_times, game.counter)
    }
}