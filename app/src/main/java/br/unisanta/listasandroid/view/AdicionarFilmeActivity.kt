package br.unisanta.listasandroid.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.listasandroid.R
import br.unisanta.listasandroid.dao.FilmeDao
import br.unisanta.listasandroid.model.Filme

class AdicionarFilmeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_filme)

        val edtTitulo = findViewById<EditText>(R.id.edt_titulo)
        val edtDiretor = findViewById<EditText>(R.id.edt_diretor)
        val btnAdicionarFilme = findViewById<Button>(R.id.btn_adicionar_filme)

        btnAdicionarFilme.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val diretor = edtDiretor.text.toString()

            if (titulo.isNotEmpty() && diretor.isNotEmpty()) {
                val filme = Filme(titulo, diretor)
                FilmeDao.adicionarFilme(filme)
                Toast.makeText(this, "Filme Adicionado!", Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_LONG).show()
            }
        }
    }
}