package POO

class Persona(val Nombre: String, val edad: Int, val ciudad: String){
    fun saludar(){
        println("Hola mi nombre es $Nombre tengo $edad años y vivo en $ciudad")
    }
    fun esMayorDeEdad() : Boolean{
        if (edad >= 18) {
            return true
        }else {
            return false
        }
    }
    fun main (){
        val persona1 = Persona ("Ana", 20, "Guadalajara")
        val persona2 = Persona ("Luis", 15, "León")
        println(saludar())
        println(persona1.Nombre + "Es mayor de edad:" + esMayorDeEdad())
        println(persona2.Nombre + "Es mayor de edad:" + esMayorDeEdad())
    }
}