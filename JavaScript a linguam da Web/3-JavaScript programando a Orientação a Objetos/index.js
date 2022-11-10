import {Cliente} from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente("Ricardo", 1122334455);
const cliente2 = new Cliente("Alice", 66778899);

//Cliente Ricardo --
const contaCorrenteRicardo = new ContaCorrente(1001 , cliente1);
contaCorrenteRicardo.depositar(500);

//Cliente Alice --
const contaCorrenteAlice = new ContaCorrente(2002 , cliente2);

// Transferindo de uma conta para outra
contaCorrenteRicardo.transferir(200, contaCorrenteAlice);

console.log(cliente1);
console.log(cliente2);


