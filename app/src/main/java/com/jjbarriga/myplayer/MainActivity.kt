package com.jjbarriga.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Hello Kotlin!")
        /*val message: TextView = findViewById(R.id.message)
        message.text = "Hello Kotlin!"*/
        val message: EditText = findViewById(R.id.message)
        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener { toast("Este es el mensaje: ${message.text}") }
    }



    private fun toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

