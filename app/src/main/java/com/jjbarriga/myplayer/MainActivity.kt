package com.jjbarriga.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jjbarriga.myplayer.adaptadores.MediaAdapter
import com.jjbarriga.myplayer.databinding.ActivityMainBinding
import com.jjbarriga.myplayer.utils.getItems
import com.jjbarriga.myplayer.utils.startActivity
import com.jjbarriga.myplayer.utils.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Logger {
    //si queremos se puede sobreescribir el tag porque las interfaces pueden contener codigo
    override val tag: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toast("Hello Kotlin!")
        /*val message: TextView = findViewById(R.id.message)
        message.text = "Hello Kotlin!"*/

        //val recycler: RecyclerView = findViewById(R.id.recycler)
        /*JAVA
        recycler.setAdapter....*/
        //KOTLIN
        binding.recycler.adapter = MediaAdapter(getItems())     //hay que asegurarse de que se añade el seleccionado

        /*recycler.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                toast("onClickListener en JAVA")
            }
        })*/

        recycler.setOnClickListener { toast("onClickListener en KOTLIN") }

        logD("I'm here")


        toast("holo", Toast.LENGTH_LONG) //sobreescribiendo length
        //startActivity<MainActivity>()//funcion de extension (esto ahy que investigarlo)

    }

}


