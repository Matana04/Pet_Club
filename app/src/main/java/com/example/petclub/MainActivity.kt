package com.example.petclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btTelaCadastro = findViewById<Button>(R.id.btTelaLogin)

        btTelaCadastro.setOnClickListener{
            val navegarCadastro = Intent(this,Cadastro::class.java)
            startActivity(navegarCadastro)
        }
        var btEnviar = findViewById<Button>(R.id.btEnviar)

        btEnviar.setOnClickListener{
            val irHome = Intent(this,Home::class.java)
            if (1 + 1 == 2){
                startActivity(irHome)
            } else {
                btEnviar.text = "Senha Incorreta"
            }
        }

    }
}