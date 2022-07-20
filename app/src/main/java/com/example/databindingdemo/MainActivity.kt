package com.example.databindingdemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //int i
    //var i :int
    private lateinit var binding: ActivityMainBinding
    private lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.btnSetValue.setOnClickListener(){
            student = Student(name = "Ali", age = 20, programme = "RSD")
            binding.myData = student
        }

        //todo:: display student info
        binding.btnDisplay.setOnClickListener(){
            student.programme = "RIS"
            //binding.tvName.text = student.name
            //binding.tvAge.text = student.age.toString()
            //binding.tvProgramme.text = student.programme

            binding.apply{
                invalidateAll()
            }

        }
    }
}