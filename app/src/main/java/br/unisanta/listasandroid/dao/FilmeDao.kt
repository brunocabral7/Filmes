package br.unisanta.listasandroid.dao

import br.unisanta.listasandroid.model.Filme

class FilmeDao {
    companion object {
        private val filmes = mutableListOf<Filme>()
        init {

            filmes.add(Filme("Inception", "Christopher Nolan"))
            filmes.add(Filme("The Matrix", "Lana Wachowski"))
            filmes.add(Filme("The Shawshank Redemption", "Frank Darabont"))
        }
        fun adicionarFilme(filme: Filme) {
            filmes.add(filme)
        }

        fun obterFilmes(): List<Filme> {
            return filmes
        }
    }
}