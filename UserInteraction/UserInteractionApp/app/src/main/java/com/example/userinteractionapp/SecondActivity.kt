package com.example.userinteractionapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonOpenMenu.setOnClickListener {
            val popup = PopupMenu(this@SecondActivity,buttonOpenMenu)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId){
                    R.id.action_edit ->{
                       Toast.makeText(applicationContext,"Pressed Edit",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_delete ->{
                        Toast.makeText(applicationContext,"Pressed Delete",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false


                }

            }

            popup.show()



        }

         buttonNextPage.setOnClickListener{
             startActivity(Intent(this@SecondActivity,ThirdActivity::class.java))
         }
    }
}