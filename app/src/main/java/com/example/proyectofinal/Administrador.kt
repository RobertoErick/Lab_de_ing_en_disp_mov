package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.ControlAction
import android.widget.Button

class Administrador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrador)

        val estudiantes: Button = findViewById(R.id.btn_estudiantes)
        estudiantes.setOnClickListener {
            val intent = Intent(this, Estudiantes_Administrador::class.java)
            startActivity(intent)
        }

        val crear_cuenta_de_acceso: Button = findViewById(R.id.btn_crear_cuenta_de_acceso)
        crear_cuenta_de_acceso.setOnClickListener {
            val intent = Intent(this, Crear_Cuenta_De_Acceso_Administrador::class.java)
            startActivity(intent)
        }

        val control_de_acceso: Button = findViewById(R.id.btn_control_de_acceso)
        control_de_acceso.setOnClickListener {
            val intent = Intent(this, Control_De_Acceso_Administrador::class.java)
            startActivity(intent)
        }

        val rol_semanal: Button = findViewById(R.id.btn_rol_semanal_admin)
        rol_semanal.setOnClickListener {
            val intent = Intent(this, Rol_Semanal_Administrador::class.java)
            startActivity(intent)
        }

        val notificar: Button = findViewById(R.id.btn_notificar)
        notificar.setOnClickListener {
            val intent = Intent(this, Notificar_Administrador::class.java)
            startActivity(intent)
        }

        val btn_duda: Button = findViewById(R.id.cerrar_sesion)
        btn_duda.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val chat: Button = findViewById(R.id.btn_chat_admin)
        chat.setOnClickListener {
            val intent = Intent(this, Chat::class.java)
            startActivity(intent)
        }
    }
}