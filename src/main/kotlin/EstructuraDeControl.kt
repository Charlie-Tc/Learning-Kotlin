// ESTRUCTURA DE CONTROL


// if: se utiliza para evaluar una condición y ejecutar un bloque de código si la condición es verdadera.
// else: ejecuta un código si la condición es falsa.
// if-else: Permite manejar múltiples condiciones en cascada.
fun ecIfElse(){
    val num = 3

    if (num < 3) {
        println("Si, $num es menor que 3")
    } else if (num == 3) {
        println("$num es igual a 3")
    } else {
        println("No, $num es mayor que 3")
    }
}

// when: Se utiliza para ejecutar un bloque de código en función de un valor.
fun EcWhen() {
    val rangeNumber = 23
    when (rangeNumber) {
        in 1..12 -> println("Eres un niño")
        in 13..17 -> println("Eres un adolecente")
        in 18..24 -> println("Eres un joven")
        in 25..64 -> println("Eres un adulto")
        else -> println("Eres un adulto mayor")
    }
}

// while: se utiliza para jecutar 1un bloque de código mientras que una condicion sea verdadetra.
fun EcWhile() {
    var num = 4
    while (num > 0) {
        println("soy número $num")
        num--
    }
}

// do-while: es una estructura de control que ejecuta un bloque de código al menos una vez y luego continúa ejecutándola mientras una condición sea verdadera.
fun EcDoWhile() {
    var count = 5
    do {
        count++
        println("accountant: $count")
    } while (count < 8)
}

// for: se utiliza para iterar una colección o secuencia.
fun EcFor() {
    val names = listOf("Liz", "Diana", "Rosé")
    val city = listOf("Tiang", "Kamsun", "Loves")

    for (n in names) println("So cute my $n")
    city.forEach {c -> println("$c es una ciudad muy bonita")}

    val caracteresDeNames: List<Int> = names.map { n -> n.length }
    println(caracteresDeNames)

    val tame = caracteresDeNames.filter { lenNames -> lenNames > 3}
    println(tame)

}


// Valores nulos(?): representa la ausencia de un valor, para declarar una variable nulable se añade '?'.
// Operador Double Bang(!!): Se utiliza para forzar la conversión de un valor nulo a un valor no nulo.
fun nulo_Dbang() {
    val name: String? = null
    try {
        name!!.length
    } catch (exception: NullPointerException) {
        println("Ha ocurrido un error")
    }


    val num1 = 10
    val num2 = 0
    val resultado: Int = try {num1 / num2} catch (exception : ArithmeticException) {0}
    println(resultado)
}


// //List: Representa una lista inmutable (no modificable) de elementos.
fun listas(){
    val lista: MutableList<String> = mutableListOf("Manzana", "Banana", "Cereza")
    println(lista)
    lista.add("Durazno")
    println(lista)
    println("\n")

    // Crea una lista de números
    val numeros = mutableListOf(1, 2, 3, 4, 5)

    // Obtiene el tamaño de la lista
    println(numeros.size) // 5

    // Obtiene el elemento en la posición 2
    println(numeros[2]) // 3

    // Agrega un elemento a la lista
    numeros.add(6)

    // Elimina el elemento en la posición 2
    numeros.removeAt(2)

    // Itera sobre la lista
    numeros.forEach { println(it) } // 1 2 4 5

    // Crea una nueva lista con los elementos multiplicados por 2
    val numerosMultiplicados = numeros.map { it * 2 }
    println(numerosMultiplicados) // [2, 4, 6, 8, 10]

    // Crea una nueva lista con los elementos mayores que 3
    val numerosMayoresQue3 = numeros.filter { it > 3 }
    println(numerosMayoresQue3) // [4, 5]

    // Ordena la lista
    numeros.sort()
    println(numeros) // [1, 2, 4, 5, 6]

    // Mezcla la lista
    numeros.shuffle()
    println(numeros) // [6, 5, 4, 2, 1]

    // Obtiene una nueva lista con los elementos desde la posición 2 hasta la posición 4
    val subLista = numeros.subList(2, 4)
    println(subLista) // [4, 5]

}


// maps: Los mapas son colecciones de pares de clave-valor, exiten 2 tipos tanto como mutables y inmutables.
fun mapas(){
    val MyArtistFavorite = mapOf("Ju Jingyi" to 29, "Wang Churan" to 24)
    println(MyArtistFavorite)

    //MÉTODOS DE ACCESO
    // .get(key): Devuleve el valor asociado a la clave.
    MyArtistFavorite.get("Ju Jingyi")


    // .contaninsKey(key): Devuelve true si la clave está en la mapa, false si no.
    MyArtistFavorite.containsKey("Wang Churan")

    // .containsValue(): Devuelve true si el valor value está en la mapa, false si no.
    MyArtistFavorite.containsValue(23)

    val MyFavoriteArtist = mutableMapOf("Ju Jingyi" to 27, "Wang Churan" to 23)
    val MyFavorite = mutableMapOf("Sandra Ma" to 35, "Feng Timo" to 31)

    // MÉTODOS DE MODIFICACIÓN
    //put(key, value): Agrega un elemento nuevo al mapa.
    MyFavoriteArtist.put("Gloria",32)
    //putAll(map): Agrega todos los elementos de un mapa a otro mapa.
    MyFavorite.putAll(MyFavoriteArtist)
    println(MyFavorite)
    //remove(key): Elimina el elemento asociado a la clave key del mapa.
    MyFavorite.remove("Feng Timo")

    println(MyFavorite)

    // MÉTODOS DE ITERACIÓN:

    // forEach(): Ejecuta un bloque de código para cada elemento del mapa.
    MyFavorite.forEach{(key, value) -> println("$key tiene $value años")}

    // keys(): Devuelve una secuencia con las claves del mapa.
    println("keys: ${MyFavorite.keys}")

    // values(): Devuelve una secuencia con los valores del mapa.
    println("values: ${MyFavorite.values}")

    // MÉTODOS DE COMPARACIÓN:
    // equals(other): Devuelve true si el mapa es igual a otro mapa, false si no.
    println("La mapa MyFavorite es igual a la mapa MyFavoriteArtist?: ${MyFavorite.equals(MyFavoriteArtist)}")

    // isEmpty(): Devuelve true si el mapa está vacío, false si no.
    println("La mapa MyFavorite está vacía?: ${MyFavorite.isEmpty()}")

    // isNotEmpty(): Devuelve true si el mapa no está vacío, false si está vacío.
    println("La mapa MyFavorite no está vacía?: ${MyFavorite.isNotEmpty()}")

    // clear(map): Elimina todos los elemento de la mapa
    MyFavorite.clear()
    println("Mi mapa: $MyFavorite")
}


// sets: Son colecciones de elementos únicos.
fun setsc(){
    val number = setOf(1, 2, 3, 4, 2, 1)
    println(number)

    val letters = mutableSetOf("K", "O","O","T","L","I")

    letters.add("N")
    println(letters)
}

fun main(){
    ecIfElse()
    EcWhen()
    EcWhile()
    EcDoWhile()
    EcFor()
    nulo_Dbang()
    listas()
    mapas()
    setsc()
}



