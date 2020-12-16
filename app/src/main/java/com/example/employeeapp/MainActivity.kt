package com.example.employeeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submitevent(view: View){
        var getempname=findViewById<EditText>(R.id.empname)
        Toast.makeText(this,getempname.text.toString(),Toast.LENGTH_LONG).show()
    }
    fun regevent(view: View)
    {
        intent= Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }

}
