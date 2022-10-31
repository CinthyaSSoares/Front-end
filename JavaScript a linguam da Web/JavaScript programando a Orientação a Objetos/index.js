class Cliente{
    nome;
    cpf;
}

class ContaCorrente{
    agencia;
    _saldo;

    sacar(valor){
        if(this._saldo >= valor) {
            this._saldo -= valor;
            return valor;
        }
    }

    depositar(valor){
        if(valor > 0) return;
        this._saldo += valor;
    }

const cliente1 = new Cliente();
const cliente2 = new Cliente();


cliente1.nome = "Ricardo";
cliente1.cpf = 1122334455;

cliente2.nome = "Alice";
cliente2.cpf = 66778899;


const contaCorrenteRicardo = new ContaCorrente();
contaCorrenteRicardo._saldo = 1000;
contaCorrenteRicardo.agencia = 1001;

contaCorrenteRicardo.depositar(100);

contaCorrenteRicardo.sacar(50)
console.log(contaCorrenteRicardo); 

