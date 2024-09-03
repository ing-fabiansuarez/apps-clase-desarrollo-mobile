package me.fabiansuarez.kotlin_fundamentals.poo

class Commet(val autor: User, val content: String) {
    private val creationDate: String = getCurrentDate()

    fun showContent() {
        println("${autor.nombre} comentó: $content en $creationDate")
    }

    private fun getCurrentDate(): String {
        return "2024-09-02"
    }
}