package com.example.userinteractionapp

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_fourth.*


class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        buttonSnackNormal.setOnClickListener { view ->
           Snackbar.make(view,"Hello",Snackbar.LENGTH_SHORT).show()
        }
        buttonSnackReturn.setOnClickListener { view ->
            Snackbar.make(view,"Are you wanna delete message?",Snackbar.LENGTH_LONG).setAction("Yes"){view ->
                Snackbar.make(view,"Message Deleted",Snackbar.LENGTH_SHORT).show()
            }.show()
        }
        buttonSnackSpecial.setOnClickListener { view ->
            val sb=Snackbar.make(view,"You haven't an internet connection",Snackbar.LENGTH_LONG)
            sb.setAction("Try Again"){
                Snackbar.make(view,"Connected",Snackbar.LENGTH_SHORT).show()
            }
            sb.setActionTextColor(Color.RED)
            sb.show()
        }
        buttonReturnMain.setOnClickListener {
            startActivity(Intent(this@FourthActivity,MainActivity::class.java))
        }
    }
}