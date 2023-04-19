package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.iniciar_sesion)
        lateinit var spinner1: Spinner
        spinner1 = findViewById(R.id.spinner) as Spinner

        val opciones = arrayOf("Administrador", "Becario | Servicio Social")
        val adapter = ArrayAdapter(this, R.layout.spinner_item_opciones, opciones)
        spinner1.adapter = adapter

        btn.setOnClickListener {
            val seleccion = spinner1.selectedItem.toString()
            if (seleccion == "Administrador") {
                val intent = Intent(this, Administrador::class.java)
                startActivity(intent)
            } else if (seleccion == "Becario | Servicio Social") {
                val intent1 = Intent(this, Becario::class.java)
                startActivity(intent1)
            }
        }

        val btn_duda: Button = findViewById(R.id.boton_duda)
        btn_duda.setOnClickListener {
            val intent = Intent(this, preguntas_frecuentes::class.java)
            startActivity(intent)
        }

    }
}