package br.unisanta.listasandroid.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listasandroid.R
import br.unisanta.listasandroid.adapter.FilmeAdapter
import br.unisanta.listasandroid.dao.FilmeDao
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)
        val fabAdicionarFilme = findViewById<FloatingActionButton>(R.id.fab_adicionar_filme)


        rvFilmes.layoutManager = LinearLayoutManager(this)
        rvFilmes.adapter = FilmeAdapter(FilmeDao.obterFilmes())


        fabAdicionarFilme.setOnClickListener {
            val intent = Intent(this, AdicionarFilmeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        val rvFilmes = findViewById<RecyclerView>(R.id.rv_filmes)
        rvFilmes.adapter?.notifyDataSetChanged()
    }
}