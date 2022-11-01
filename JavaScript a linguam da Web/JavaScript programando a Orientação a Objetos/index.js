import {Cliente} from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente();
const cliente2 = new Cliente();


cliente1.nome = "Ricardo";
cliente1.cpf = 1122334455;

cliente2.nome = "Alice";
cliente2.cpf = 66778899;

//Cliente Ricardo --
const contaCorrenteRicardo = new ContaCorrente();
contaCorrenteRicardo.agencia = 1001;
contaCorrenteRicardo.cliente = cliente1;

contaCorrenteRicardo.depositar(500);


//Cliente Alice --
const contaCorrenteAlice = new ContaCorrente();
contaCorrenteAlice.agencia = 2002;
contaCorrenteAlice.cliente = cliente2;

// Transferindo de uma conta para outra
contaCorrenteRicardo.transferir(200, contaCorrenteAlice);

console.log(cliente1);
console.log(cliente2);


