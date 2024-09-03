package br.unisanta.listasandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listasandroid.R
import br.unisanta.listasandroid.model.Filme

class FilmeAdapter(private val filmes: List<Filme>) : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent, false)
        return FilmeViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filme = filmes[position]
        holder.txvTituloFilme.text = filme.titulo
        holder.txvDiretorFilme.text = filme.diretor
    }

    override fun getItemCount(): Int {
        return filmes.size
    }

    class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txvTituloFilme: TextView = itemView.findViewById(R.id.txv_titulo_filme)
        val txvDiretorFilme: TextView = itemView.findViewById(R.id.txv_diretor_filme)
    }
}