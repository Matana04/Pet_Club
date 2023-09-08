package com.example.petclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var btTelaLogin = findViewById<Button>(R.id.btTelaLogin)

        btTelaLogin.setOnClickListener {

            val navegarCadastro = Intent(this, MainActivity::class.java)
            startActivity(navegarCadastro)
        }
    }
}