package Ejercicios
//A PIE (ABSTRACCION, POLIMORFISMO, HERENCIA,)
//Polimorfismo --> TODO SE VUELVE LO MISMO y se puede usar
//ABSTRACCION --> SOLO CONSEGUIR LO ESENCIAL NO SE PUEDEN INSTANCIAR Y ES LO QUE SE QUEDA VACIO
//HERENCIA --> AGARRAR UNA CLASE GENERICA E IMPLEMENTAS CON LAS CLASES HIJAS
//ENCAPSULAMIENTO --> OCULTAS PARA QUE NO SE PUEDA USAR FUERA DE LA CLASE EN DONDE SE CREO
class Person(val name: String, val age: Int){
    fun sayHello(language: String){
        if (language == "Spanish") {
            println("Hola soy $name y tengo $age años ")
        }
        else{
            println("Hello I´m $name and I´m $age years old")
        }

    }
    fun caminar() : Double{
        return 10.0
    }
}

fun main (){
    val person = Person(name = "Diego Roa", age = 28)
    val person2 = Person(age = 29, name = "Diego Roa")
    val square = Square(side = 10.0)
    val circle = Circle(radius = 10.0)
    println(square.side)
    val shapes = listOf<Shape>(square,circle)
    for (shape in shapes){
        println(shape.calculateArea())
    }
}
//ABSTRACCION
abstract class Shape{
    abstract fun calculateArea() : Double
}

class Square(val side: Double) : Shape(){
    override fun calculateArea(): Double {
        return side * side
    }

}

class Circle(private val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return  Math.PI * radius * radius
    }

}

