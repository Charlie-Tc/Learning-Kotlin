

fun main() {
    // VARIABLES
// En kotlin, las variables son contenedores que almacenan datos. seutilizan para almacenar valores que se utilizan en el código.
// Las variables en kotlin se declaran usando las palabras clave "val" y "var"-

// val: se usa para declarar variables que no pueden cambiar de valor.

//variable de tipo flotante
    val pi: Float = 3.1416F

// variable de tipo booleano
    val bool: Boolean = true
// Variables anulables: son variables que pueden contener un valor nulo.

// declara una variables anulable
    val text: String? = null

// var: se usa para declarar variables que pueden cambiar de valor.
    var name = "Charlie"
    var num1 = 23
    num1 = 20
    name = "Charly"

    println(name)
    println(num1)


    // TIPOS DE DATOS

    // 1 Números enteros:

    // Byte: Representa números enteros de 8 bits con signo.
    val enteroByte: Byte = 127

    //Short: Representa números enteros de 16 bits con signo.
    val enteroShort: Short = 32767

    //Int: Representa números enteros de 32 bits con signo (el tipo de dato por defecto para enteros).
    val enteroInt: Int = 2147483647

    //Long: Representa números enteros de 64 bits con signo.
    val enteroLong: Long = 9223372036854775807L


    // 2 Números en coma flotante:

    // Float: Representa números de coma flotante de 32 bits.
    val flotanteFloat: Float = 3.14f

    //Double: Representa números de coma flotante de 64 bits (el tipo de dato por defecto para números decimales).
    val flotanteDouble: Double = 3.14159265359

    // 3 Caracteres y cadenas de caracteres:

    // Char: Representa un solo carácter Unicode.
    val caracter: Char = 'A'
    //String: Representa una secuencia de caracteres Unicode (el tipo de dato por defecto para cadenas de caracteres).
    val cadena: String = "Hola, Kotlin!"


    // 4 Valores Lógicos:
    // Boolean: Representa un valor booleano, que puede ser 'true' o 'false'
    val verdadero: Boolean = true
    val falso: Boolean = false


    // 5 Colecciones:

    // Array: Representa una colección homogénea de elementos con un tamaño fijo.
    val arreglo: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    //List: Representa una lista inmutable (no modificable) de elementos.
    val lista: List<String> = listOf("Manzana", "Banana", "Cereza")
    println(lista)

    //MutableList: Representa una lista mutable (modificable) de elementos.
    val listaMutable = mutableListOf("perro", "gato", "conejo")
    listaMutable.add("loro")
    println(listaMutable)

    //Set: Representa un conjunto inmutable de elementos sin duplicados.
    val conjunto: Set<Double> = setOf(1.1, 2.2, 3.3, 4.4, 5.5)
    println(conjunto)

    //MutableSet: Representa un conjunto mutable de elementos sin duplicados.
    val conjuntoMutable = mutableSetOf("rojo", "verde", "azul")
    conjuntoMutable.add("amarillo")
    println(conjuntoMutable)

    //Map: Representa un mapa inmutable de pares clave-valor.
    val mapaInmutable = mapOf("clave1" to 10, "clave2" to 20, "clave3" to 30)
    println(mapaInmutable)

    //MutableMap: Representa un mapa mutable de pares clave-valor.
    val mapaMutable = mutableMapOf("nombre" to "Juan", "edad" to 25)
    mapaMutable["ciudad"] = "Barcelona"
    println(mapaMutable)



    // 6 Rangos:
    // ClosedRange: Representa un rango cerrado de valores.
    val rango: IntRange = 1..10
    println("el rango cerrado de valores es: $rango")


    // 7 Tipos Especiales:
    // Any: Es la supertipo de todos los tipos no nulos en Kotlin.
    val cualquierDato: Any = "Esto es un ejemplo"
    println("El resultado del tipo de dato Any: $cualquierDato")

    //Nothing: Representa un valor que nunca existe realmente en tiempo de ejecución (a menudo se usa para funciones que nunca retornan).
    // val nada: Nothing = throw IllegalArgumentException("Mensaje de error")


    // 8 Tipos de datos personalizados:
    // puedes crear tus propios tipos de datos personalizados utilizando la palabra clave 'class' o 'data class'.
    class MiClase(val nombre: String, val edad: Int)
    data class Datos(val nombre: String, val valor: Double)

    // 9 Tipos de datos especiales para manejo de nulos:
    // T?: Donde 'T' es cualquier tipo de dato, representa un tipo de dato nullable, es decir, que puede contener un valor nulo.
    val nullableString: String? = null
    val nullableInt: Int? = 42
}
