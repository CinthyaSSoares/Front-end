import { Conta } from "./Contas/Conta.js";

//Apenas por que a ContaCorrente herda da classe Conta (extends), pode ser usado atribuição privada _saldo/_agencia
export class ContaCorrente extends Conta{
    static numeroDeContas = 0;
    constructor(cliente, agencia) {
        super(0, cliente, agencia);
        ContaCorrente.numeroDeContas += 1;
    }

  //Sobrescrevendo / filho de Conta
    sacar(valor) {
        let taxa = 1.1;
        return this._sacar(valor, taxa);
    }
}