package com.example.assignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flag1 = "The Three Musketeers"
        val spinner1: Spinner = findViewById(R.id.movieSpinner)
        var options1 = arrayOf("Shazam! Fury of the Kings","Creed III","Winnie the Pooh: Blood and Honey(18+)","Plane","Operation Fortune: Ruse de guerre")
        spinner1.adapter =
        ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options1)
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag1 = options1.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        var flag2 = "12:00-3:00"
        val spinner2: Spinner = findViewById(R.id.timeSpinner)
        var options2 = arrayOf("3:00-6:00","6:00-9:00","9:00-12:00")
        spinner2.adapter =
            ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options2)
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag2 = options2.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var dialog_var1 = DateTimeDialog()
        var dialog_var3 = FeedaBackDialog()

        when(item.itemId){
            R.id.timeDate ->dialog_var1.show(supportFragmentManager,"Date/Time Dialog")
            R.id.feedback->dialog_var3.show(supportFragmentManager,"Feedback Dialog")

        }
        return true
    }

    fun feedback(s1: String, s2: String)
    {
        val feedback:TextView = findViewById(R.id.feedback)
        feedback.text=s1+", "+s2
    }
}