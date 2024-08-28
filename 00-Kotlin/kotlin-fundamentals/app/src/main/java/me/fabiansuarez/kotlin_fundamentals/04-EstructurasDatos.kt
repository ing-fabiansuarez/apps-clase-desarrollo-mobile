package me.fabiansuarez.kotlin_fundamentals


fun main() {
    println("##############################################")
    println("######## ESTRUCTURAS DE DATOS ################")
    println("##############################################")

    //ARRAY LIST
    val productsList: ArrayList<String> = arrayListOf("pantalla", "teclado", "mouse")
    println(productsList)
    //agregar elementos
    productsList.add("mousepad")
    //modificar elementos
    productsList[0] = "monitor"
    //eliminar elementos
    productsList.removeAt(2)
    println(productsList)
    val firstElement = productsList.first()
    productsList.forEach {
        println(it)
    }

    //MAPAS O DICCIONARIOS / CLAVES Y VALORES

    val monitor = mutableMapOf<String, Any>("id" to 1)
    monitor["name"] = "Sony"
    monitor["price"] = 250000.0
    monitor["size"] = "42 pulgadas"
    monitor["isSmart"] = true
    println(monitor)

    for (field in monitor) {
        println(field)
    }

    for (i: Int in 0 until 10 step 2) {
        println(i)
    }

    var x: Int = 0

    while (x < 3) {
        println(x)
        x++
    }

    var y: Int = 0

    do {
        println(y)
        y++
    } while (y < 3)

}

