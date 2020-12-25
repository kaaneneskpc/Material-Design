package com.example.userinteractionapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.example.userinteractionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.buttonNormal.setOnClickListener{
          Toast.makeText(applicationContext,"Hello",Toast.LENGTH_SHORT).show()
        }

        binding.buttonSpecial.setOnClickListener{
         val design = layoutInflater.inflate(R.layout.toast_design,null)
         val textViewMessage = design.findViewById(R.id.textViewMessage) as TextView
         textViewMessage.text = "Hello Special Message"
         val toastSpecial = Toast(applicationContext)
         toastSpecial.view = design
         toastSpecial.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
         toastSpecial.duration=Toast.LENGTH_LONG
         toastSpecial.show()
        }
        binding.buttonPass.setOnClickListener{
          startActivity(Intent(this@MainActivity,SecondActivity::class.java))
        }


    }
}