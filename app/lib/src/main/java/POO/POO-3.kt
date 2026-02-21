package POO

open class Animal (val nombre : String, val edad : Int){
    open fun hacerSonido(){
        println("Sonido Generico")
    }
    fun describirse(){
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro (nombre: String, edad: Int) : Animal (nombre, edad){
    override fun hacerSonido() {
        println("Guaf")
    }
}
class Gato (nombre: String, edad: Int) : Animal (nombre, edad){
    override fun hacerSonido() {
        println("Miau")
    }
}

class Vaca (nombre: String, edad: Int) : Animal (nombre, edad){
    override fun hacerSonido() {
        println("Muuu")
    }
}

fun main (){
    val perro = Perro ("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    val gato = Gato ("Miauricio", 4)
    gato.describirse()
    gato.hacerSonido()
    val vaca = Vaca ("Alberto", 7)
    vaca.describirse()
    vaca.hacerSonido()
}