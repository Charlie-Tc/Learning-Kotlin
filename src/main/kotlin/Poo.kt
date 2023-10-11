// PROGRAMACIÓN ORIENTADA A OBJETOS
// Es una paradigma de programación que se basa en la idea de que los programas deben estar diseñados y estructurados  entorno a objetos.
// Se utiliza para modelar sitemas complejos y organizar el código de manera más eficiente, promoviendo la reutilización, la modularidad y la legibilidad.

fun main(){
    clasesRegulares()
    clasesAbstractas()
    val circulo = Circulo(6.0)
    println(circulo.area) // 78.53981633974483
    clasesAnidadas()
    clasesInternas()

    imprimirColor(Color.Rojo) // El color es rojo
}





// CLASES REGULARES
// Una clase regular es una clase que puede definir sus propias propiedades, métodos y constructores.
// Las clases regulares se utilizan para crear objetos que pueden almacenar datos y realizar acciones.

fun clasesRegulares(){
    class Person(var name: String, var age: Int, var city: String) {
        fun showInformation() {
            println("Hola mi nombre es $name y tengo $age años y vivo en $city")
        }
    }


    val persona = Person("Liz", 18, "California")
    val persona2 = Person("Charlie", 23, "Cuzco")
    persona.showInformation()
    persona2.showInformation()
}





// CLASES ABSTRACTAS
// Una clase abstracta es una clase que no se puede instanciar directamente.
// Las clases abstractas se utilizan para definir una interfaz que otras clases pueden implementar.
fun clasesAbstractas() {
    abstract class FiguraGeometrica {
        abstract fun calcularArea(): Double
    }

    class Circulo(val radio: Double) : FiguraGeometrica() {
        override fun calcularArea(): Double {
            return Math.PI * radio * radio
        }
    }

    val circulo = Circulo(5.0)
    println(circulo.calcularArea())
}





// CLASES INTERFACES
// Una interfaz es una clase que solo define las propiedades y métodos que deben implementar otras clases.
// Las interfaces se utilizan para definir un contrato que las clases deben cumplir.
interface FiguraGeometric {
    val area: Double
    fun calcularArea(): Double
}

class Circulo(val radio: Double) : FiguraGeometric {
    override val area: Double
        get() = Math.PI * radio * radio

    override fun calcularArea(): Double {
        return area
    }
}





// CLASES ANIDADAS
// Una clase anidada es una clase que se define dentro de otra clase.
// Las clases anidadas se utilizan para ocultar la implementación de una clase o para agrupar clases relacionadas.
fun clasesAnidadas () {
    class Persona {
        inner class Direccion {
            val calle: String
            val numero: Int

            constructor(calle: String, numero: Int) {
                this.calle = calle
                this.numero = numero
            }
        }

        val direccion = Direccion("Calle Mayor", 123)
    }

    val persona = Persona()
    println(persona.direccion.calle) // Calle Mayor
}





// CLASES INTERNAS
// Una clase interna es una clase que se define dentro de otra clase, pero tiene acceso a los miembros privados de la clase externa.
// Las clases internas se utilizan para ocultar la implementación de una clase o para implementar un patrón de diseño.
fun clasesInternas () {
    class Persona {
        private val cuentaBancaria = 123456789

        inner class CuentaBancaria {
            fun consultarSaldo() {
                println(cuentaBancaria)
            }
        }
    }

    val persona = Persona()
    val cuentaBancaria = persona.CuentaBancaria()
    cuentaBancaria.consultarSaldo() // 123456789
}





// CLASES SELLADAS
// Una clase sellada es una clase que solo puede tener subclases específicas.
// Las clases selladas se utilizan para restringir la herencia y evitar la creación de subclases no deseadas.
sealed class Color {
    object Rojo : Color()
    object Verde : Color()
    object Azul : Color()
}

fun imprimirColor(color: Color) {
    when (color) {
        is Color.Rojo -> println("El color es rojo")
        is Color.Verde -> println("El color es verde")
        is Color.Azul -> println("El color es azul")
    }
}




