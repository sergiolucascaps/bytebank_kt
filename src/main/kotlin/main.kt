fun main() {
    print("Bem vindo ao bytebank\n")

    var conta1 = Conta("Titular O.O", 1000)
    conta1.depositar(1000.0)
    conta1.sacar(250.0)

    var conta2 = Conta(titular = "Titular O.1", numeroConta = 1000)
    conta2.depositar(2000.0)
    conta2.sacar(350.0)

    var conta3 = Conta(numeroConta = 1000, titular = "Titular O.2")
    conta3.depositar(3000.0)
    conta3.sacar(450.0)

    println(conta1.titular)
    println(conta1.numeroConta)
    println(conta1.saldo)

    println(conta2.titular)
    println(conta2.numeroConta)
    println(conta2.saldo)

    println(conta3.titular)
    println(conta3.numeroConta)
    println(conta3.saldo)

//    testaSaldo(saldo);
}

class Conta(
    val titular: String,
    val numeroConta: Int
) {
    //    NÃO HÁ NECESSIDADE DE CRIAR AS PROPRIEDADES,
//    POIS ESTÃO SENDO CRIADAS E RECEBIDAS PELO CONSTRUTOR PRIMÁRIO
//    var titular = ""
//    var numeroConta = 0
    var saldo = 0.0
        private set

//    CONSTRUTOR SECUNDÁRIO
//    constructor(titular: String, numeroConta: Int) {
//        this.titular = titular
//        this.numeroConta = numeroConta
//    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }

        return false
    }
}

fun testaSaldo(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta neutra")
        saldo < 0.0 -> println("COnta negativa")
    }
}