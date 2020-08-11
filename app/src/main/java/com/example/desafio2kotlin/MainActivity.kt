package com.example.desafio2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val libros = LibrosEscolares("Bi",12,1984,
            "minerva",1999, 2990,"diosito",true)

        Log.d("Aquiestoy",libros.precioFormateado())

        val textView : TextView = findViewById(R.id.diego)
        textView.setText(libros.precioFormateado())
    }

}