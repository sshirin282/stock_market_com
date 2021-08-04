package com.example.liveproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toolbar

class MainActivity6 : AppCompatActivity() {
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var textView: TextView
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        toolbar=findViewById(R.id.toolbar2)
        textView=findViewById(R.id.textforget)
        textView.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
        toolbar.setTitle("Login")
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        setSupportActionBar(toolbar)
        editText1=findViewById(R.id.edittext)
        editText2=findViewById(R.id.edittext1)
        toolbar.setNavigationOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        })
    }


}