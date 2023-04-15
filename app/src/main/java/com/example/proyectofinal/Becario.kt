package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Becario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_becario)

        val btn_cerrar_sesion: Button = findViewById(R.id.cerrar_sesion_becario)
        btn_cerrar_sesion.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val codigo_qr: Button = findViewById(R.id.codigo_qr_btn_becario)
        codigo_qr.setOnClickListener {
            val intent = Intent(this, Codigo_QR_Becario::class.java)
            startActivity(intent)
        }

        val rol_semanal_becario: Button = findViewById(R.id.btn_rol_semanal)
        rol_semanal_becario.setOnClickListener {
            val intent = Intent(this, Rol_Semanal_Becario::class.java)
            startActivity(intent)
        }

        val notificaciones: Button = findViewById(R.id.btn_notificaciones)
        notificaciones.setOnClickListener {
            val intent = Intent(this, Notificaciones_Becario::class.java)
            startActivity(intent)
        }

        val perfil: Button = findViewById(R.id.btn_perfil)
        perfil.setOnClickListener {
            val intent = Intent(this, Perfil_Becario::class.java)
            startActivity(intent)
        }

        val chat: Button = findViewById(R.id.btn_chat_becario)
        chat.setOnClickListener {
            val intent = Intent(this, Chat::class.java)
            startActivity(intent)
        }
    }
}