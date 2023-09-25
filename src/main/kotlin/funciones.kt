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

fun main(args: Array<String>){
    funcion_lambda()
    funcionesDeOrdenSuperior()
    funcionesDeExtension()
}