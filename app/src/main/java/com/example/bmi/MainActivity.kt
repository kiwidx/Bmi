package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.example.bmi.databinding.ActivityMainBinding

//The Controller, handle data changed state, UI, flow
class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragment()
    }

    /*val transaction = supportFragmentManager.beginTransaction()
         transaction.add(R.id.my_container, guess1to10Fragment)
         transaction.commit()*/
    //Kotlin way
    private fun initFragment(){
        val  guess1to10Fragment = BlankFragment()
        supportFragmentManager.beginTransaction().run {
            add(R.id.my_container,guess1to10Fragment)
            commit()
        }
    }
}