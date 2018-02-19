package edu.rvc.student.week7

//Paul Stanek
//CIS-245-D010
//Week 7 Assignment
//2/19/2018

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Context
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind variables
        val txtMessage = findViewById<EditText>(R.id.txtMessage)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        //listen for button click and display Toast
        btnSubmit.setOnClickListener {
            hideKeyboard()
            Toast.makeText( this,  txtMessage.text.toString(), Toast.LENGTH_LONG) .show()
        }


    }
    fun hideKeyboard(){
        try{
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception){
            // TODO: handle exception
        }
    }

}
