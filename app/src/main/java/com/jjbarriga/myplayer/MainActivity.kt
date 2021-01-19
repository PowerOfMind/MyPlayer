package com.jjbarriga.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jjbarriga.myplayer.adaptadores.MediaAdapter
import com.jjbarriga.myplayer.utils.getItems

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Hello Kotlin!")
        /*val message: TextView = findViewById(R.id.message)
        message.text = "Hello Kotlin!"*/

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.adapter = MediaAdapter(getItems())

    }



    private fun toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

