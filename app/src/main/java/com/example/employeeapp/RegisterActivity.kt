package com.example.employeeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun registerevent(view: View)
    {
        var getempcode=findViewById<EditText>(R.id.empcode)
        var getempname=findViewById<EditText>(R.id.empname)
        var getdesignation=findViewById<EditText>(R.id.designation)
        var getsalary=findViewById<EditText>(R.id.salary)
        var getplace=findViewById<EditText>(R.id.place)
        var getpassword=findViewById<EditText>(R.id.pass)
        var getconfirmpass=findViewById<EditText>(R.id.confrmpass)
        Toast.makeText(this,getempcode.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getempname.text.toString(),Toast.LENGTH_LONG).show()
    } fun loginevent(view: View)
    {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
