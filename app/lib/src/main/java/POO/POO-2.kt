package POO

class CuenaBancaria(val titular : String){
    var saldo : Double = 0.0
    fun depositar(cantidad : Double){
        saldo = cantidad + cantidad
    }
    fun retirar(cantidad: Double){

    }
    fun MostrarSaldo(){
        println("El saldo es de: $saldo")
    }
    fun main(){
        val cuenta = CuenaBancaria("Maria Garcia")
        cuenta.depositar(1000.0)
        cuenta.MostrarSaldo()
    }
}