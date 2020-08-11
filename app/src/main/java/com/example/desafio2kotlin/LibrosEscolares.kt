package com.example.desafio2kotlin

data class LibrosEscolares(var nombreLibros : String,
                      val isbn : Int,
                      val anioPublicacion : Int,
                      var editorial : String,
                      var cantidadPaginas : Int,
                      var precio : Int,
                      val autorLibro : String,
                      val tipodeLibro : Boolean) {
    fun precioFormateado(): String {
        return "\$${this.precio}"

    }

    fun imprimir(){

    }

}


