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


fun main(){
    ecIfElse()
    EcWhen()
    EcWhile()
    EcDoWhile()
    EcFor()
    nulo_Dbang()
    listas()
}



