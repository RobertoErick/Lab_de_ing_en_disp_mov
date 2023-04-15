package com.example.proyectofinal

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.iniciar_sesion)
        lateinit var spinner1: Spinner
        spinner1 = findViewById(R.id.spinner) as Spinner

        val opciones = arrayOf("Administrador", "Becario | Servicio Social", "Scanner")
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
            } else if (seleccion == "Scanner") {
                val intent2 = Intent(this, Scanner::class.java)
                startActivity(intent2)
            }
        }

        val btn_duda: Button = findViewById(R.id.boton_duda)
        btn_duda.setOnClickListener {
            val intent = Intent(this, preguntas_frecuentes::class.java)
            startActivity(intent)
        }

    }
}