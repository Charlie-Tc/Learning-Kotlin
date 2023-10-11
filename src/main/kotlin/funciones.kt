// funciones: Las funciones son bloques de código que se pueden reutilizar.
// sintaxis básica:
fun nombreDeLaFuncion(parametros: String): String { // el tipo de dato que va a retornar
    return "Hola $parametros"
}


// Funciones Lambda: Son funciones anónimas que se pueden utilizar para simplificar el código, sintaxis{ parametros -> código}.
fun funcion_lambda() {
    val numeros = listOf(1, 2, 3, 4, 5)

    // Usa una función lambda para imprimir los números
    numeros.forEach { println(it) }
}


// Funciones de Orden Superior: son funciones que pueden tomar otras funciones como parámetros o devolver funciones como resultado.
fun funcionesDeOrdenSuperior() {
    fun <T> transformar(lista: List<T>, funcion: (T) -> String): List<String> {
        return lista.map(funcion)
    }

    fun imprimirNumero(numero: Int): String {
        return "$numero"
    }

    val numeros = listOf(1, 2, 3, 4, 5)

    val numerosConFormato = transformar(numeros, {numero: Int -> imprimirNumero(numero) })

    println(numerosConFormato) // [1, 2, 3, 4, 5]
}


//Funciones de extensión: Las funciones de extensión son funciones que se pueden agregar a clases existentes.
// Las funciones de extensión se declaran usando la palabra clave fun seguida del nombre de la clase a la que se está
// extendiendo y el nombre de la función.
fun funcionesDeExtension() {
    fun String.mayusculas(): String {
        return this.toUpperCase()
    }

    println("Hola".mayusculas()) // HOLA
}

fun saludar(name: String,middlename:String = "", lastname: String){
    println("Hola mi nombre es $name $middlename y mi apellido es $lastname")
}

fun main(args: Array<String>){
    funcion_lambda()
    funcionesDeOrdenSuperior()
    funcionesDeExtension()
    saludar(name="Jiang",lastname="Huiru")
    val friend: (String) -> Int = {name -> name.length}
    val lengthName= friend("Jiang Huiru")
    println(lengthName)

    val  myListNames = listOf("Feng Timo", "Jing Yi", "Sandra Ma")
    val result = myListNames.map(friend)
    println(result)

    val lambdaName = lamdaa(valorInicial = "Pepe") {name -> name.length}
    println(lambdaName)

    println("\n")
    fLet()
    fWith()
    fRun()
    fapply()
    fAlso()

}

fun lamdaa(valorInicial: String, bloque: (String) -> Int) : Int {
    return bloque(valorInicial)
}

// let : la funcion let nos sirve para trabajar de manera segura, aplicar funciones y crear ámbitos temporales en kotlin, ayuda a escribir un código más limpio y seguro al manejar objetos nulos y encadenar operaciones en un objeto.
fun fLet(){
    var nombre: String? = null
    nombre = "Carlos"
    nombre.let {
        valor -> println("el valor de nombre no es nulo, es $valor")
    }

}
class Persona(var nombre: String, var edad: Int) {
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años.")
    }
}

// with : Te permite trabajar con un objeto específico de manera más concisa y legible.  Su objetivo principal es ejecutar un bloque de código en el contexto de ese objeto, lo que significa que puedes acceder a sus miembros (propiedades y funciones) sin tener que hacer referencia al objeto repetidamente.
fun fWith(){


    val persona = Persona("Juan", 30)
    val i = persona.presentarse()

    with(persona) {
        nombre = "Ana"
        edad = 25
        presentarse()
    }

}

// run : La función run es otra de las funciones de extensión útiles en Kotlin que se utiliza principalmente para crear un ámbito temporal y ejecutar un bloque de código en ese ámbito. Proporciona un contexto donde puedes realizar operaciones en un objeto y acceder a sus propiedades y funciones de manera más concisa.
fun fRun(){
    val persona = Persona("Juan", 25)
    val resultado = persona.run {
        val nombreEnMayusculas = nombre.toUpperCase()
        val mensaje = "Hola, soy $nombreEnMayusculas y tengo $edad años."
        mensaje

    }
    println(resultado)
}

// apply : Se utiliza para configurar, modificar y trabajar objetos de manera concisa. Es especialmente útil cuando deseas encadenar múltiples operaciones en un objeto o cuando necesitas configurar un objeto al crearlo. Esta función es una herramienta valiosa para mantener un código limpio y legible cuando trabajas con objetos complejos.
fun fapply(){
    val listNames = mutableListOf("Liz", "Rosé")
    listNames.apply {
        add("Diana")
        add(0, "Flor")
        println(listNames)
    }
}

// also : Se utiliza para realizar tareas adicionales en un objeto sin modificarlo. A diferencia dde apply, que se usa para modificar el obejeto y devolverlo,
fun fAlso(){
    val namesSmartPhones = mutableListOf("Rog Strix", "Redmi 14 TPRO", "Samsung A50", "Huawei Mate 40PRO").also {
        lista -> println("Los celulares son: $lista")
    }.asReversed()
    println(namesSmartPhones )
}