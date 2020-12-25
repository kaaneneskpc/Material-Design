package com.example.userinteractionapp

import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        buttonSnackNormal.setOnClickListener {

            val alertDialog= AlertDialog.Builder(this@ThirdActivity)
            alertDialog.setMessage("Message")
            alertDialog.setTitle("Title")
            alertDialog.setIcon(R.drawable.message)

            alertDialog.setPositiveButton("Yes"){dialogInterface, i ->
                Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_SHORT).show()
          }
            alertDialog.setNegativeButton("No"){dialogInterface,i->
                Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_SHORT).show()
          }
            alertDialog.show()

        }
        buttonAlertSpecial.setOnClickListener {
            val design =layoutInflater.inflate(R.layout.alert_design,null)
            val editTextAlert = design.findViewById(R.id.editTextAlert) as EditText
            val alertDialog= AlertDialog.Builder(this@ThirdActivity)
            alertDialog.setMessage("Message")
            alertDialog.setTitle("Title")
            alertDialog.setIcon(R.drawable.message)
            alertDialog.setView(design)
            alertDialog.setPositiveButton("Save"){dialogInterface, i ->
                val getData = editTextAlert.text.toString()
                Toast.makeText(applicationContext,"Get data : $getData",Toast.LENGTH_SHORT).show()
            }
            alertDialog.setNegativeButton("No"){dialogInterface,i->
                Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_SHORT).show()
            }
            alertDialog.show()


        }
        buttonNextPageTo.setOnClickListener{
            startActivity(Intent(this@ThirdActivity,FourthActivity::class.java))
        }
    }
}