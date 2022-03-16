package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bmi.databinding.ActivityMainBinding

//The Controller, handle data changed state, UI, flow
class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding: ActivityMainBinding
    val fragments = mutableListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragment()

        binding.bottomNavBar.setOnItemSelectedListener{ item->
            when(item.itemId){
                R.id.action_guess->{
                    supportFragmentManager.beginTransaction().run {
                        replace(R.id.my_container, fragments[0])
                    }
                    true
                }
                R.id.action_bmi->{
                    true
                }
                R.id.action_camera->{
                    true
                }
                else -> true
            }
        }
        val database = Room.databaseBuilder(this, TranDataBase::class.java,"trans")

    }

    /*val transaction = supportFragmentManager.beginTransaction()
         transaction.add(R.id.my_container, guess1to10Fragment)
         transaction.commit()*/
    //Kotlin way
    private fun initFragment(){
        fragments.add(0,GuessFragment())
//        val  guess1to10Fragment = GuessFragment()
        supportFragmentManager.beginTransaction().run {
            add(R.id.my_container,fragments[0])
            commit()
        }
    }
}