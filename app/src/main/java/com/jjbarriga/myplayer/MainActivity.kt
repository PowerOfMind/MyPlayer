package com.jjbarriga.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ResultReceiver
import android.widget.TextView
import android.widget.Toast
import com.jjbarriga.myplayer.adaptadores.MediaAdapter
import com.jjbarriga.myplayer.databinding.ActivityMainBinding
import com.jjbarriga.myplayer.utils.getItems
import com.jjbarriga.myplayer.utils.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Logger {
    //si queremos se puede sobreescribir el tag porque las interfaces pueden contener codigo
    override val tag: String = javaClass.simpleName
    private val adapter by lazy { MediaAdapter(getItems()){toast(it.title)} }

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
        //binding.recycler.adapter = MediaAdapter(getItems()){toast(it.title)}     //hay que asegurarse de que se añade el seleccionado

        binding.recycler.adapter = adapter  // con el lazy, hasta que no lleguemos a esta linea,
                                            // no se ejecutara el codigo entre llaves de arriba
                                            /**********************************************************/
                                            // se usa para que cuando iniciemos la activity, retrasar
                                            // la carga del adapter si faltan datos por recibir

        adapter.items = getItems()          //esto llamaria a NotifyDataSetChanged() y actualizaria
                                            // la lista con los nuevos datos

        val textView: TextView = TextView(this).apply2 {
            text = "Hello"
            hint = "Goodbye"
            textSize = 20f
        }


        /*recycler.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                toast("onClickListener en JAVA")
            }
        })*/

        recycler.setOnClickListener { toast("onClickListener en KOTLIN") }

        logD("I'm here")


        toast("holo", Toast.LENGTH_LONG) //sobreescribiendo length
        //startActivity<MainActivity>()//funcion de extension (esto hay que investigarlo)

    }

}


fun <T> T.apply2(body: T.() -> Unit): T {
    this.body()
    return this
}

fun <T, U> T.run2(body: T.() -> U): U {
    return this.body()
}

fun <T, U> T.let2(body: (T) -> U): U {
    return body(this)
}

fun <T, U> with2(receiver: T, body: T.() -> U): U {
    return receiver.body()
}

fun <T> T.also2(body: (T) -> Unit): T {
    body(this)
    return this
}


