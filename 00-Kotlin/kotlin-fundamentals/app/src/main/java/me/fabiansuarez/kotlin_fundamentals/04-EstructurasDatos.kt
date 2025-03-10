package me.fabiansuarez.kotlin_fundamentals


fun main() {

    val productsList1: ArrayList<String> = arrayListOf("pantalla", "teclado", "mouse")
    println(productsList1)
    //agregar elementos
    productsList1.add("mousepad")
    println(productsList1)
    println(productsList1[3])

    println("##############################################")
    println("######## ESTRUCTURAS DE DATOS ################")
    println("##############################################")
    println()
    println("####### ARREGLOS ########")

    //arreglos
    var arreglo = arrayOf("pepe", "Juan", "Maria")

    println(arreglo.size)
    println("Accediendo a la posicion 2 = " + arreglo[2])
    arreglo[0] = "Ana"
    println("Accediendo a la posicion 0 = " + arreglo.get(0))

    //LISTAS
    /*
    Listas Inmutables: listOf, setOf
    Listas mutables: mutableListOf, arrayListOf, mutableSetOf
     */
    println("####### LISTAS ########")

    val list = mutableListOf(1, 2, 3, 4, 5)

    println(list)
    list.add(6)
    println(list)

    println(list[3])



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

