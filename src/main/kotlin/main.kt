fun main() {
    print("Bem vindo ao bytebank")

    val titular = "Sergio Lucas da Silva"
    val numeroConta = 1000
    var saldo = 0.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")

    var conta = Conta();
    conta.titular = "Titular O.O"
    conta.numeroConta = 1000
    conta.saldo = 100.0

    println(conta.titular)
    println(conta.numeroConta)
    println(conta.saldo)

//    testaSaldo(saldo);
}

class Conta {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
}
fun testaSaldo(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta neutra")
        saldo < 0.0 -> println("COnta negativa")
    }
}