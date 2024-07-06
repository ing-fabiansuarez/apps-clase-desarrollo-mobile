package me.fabiansuarez.kotlin_fundamentals

fun main() {
    val favoriteActor = null
    println(favoriteActor)
}


// en este erro intencional se demuestra qu eno puedes poner a una un nulo despues de haber sido asignada.
fun errorIntencional() {

    //var favoriteActor: String = "Sandra Oh"
    //favoriteActor = null
    var favoriteActor: String? = "Sandra Oh"
    favoriteActor = null

}

fun otroError() {
    //var favoriteActor: String? = "Sandra Oh"
    //println(favoriteActor.length)

    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
}

fun asercionNoNulo(){

    //var favoriteActor: String? = "Sandra Oh"
    //println(favoriteActor!!.length)

    var favoriteActor: String? = null
    println(favoriteActor!!.length)

}

fun operadorElvis(){
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
