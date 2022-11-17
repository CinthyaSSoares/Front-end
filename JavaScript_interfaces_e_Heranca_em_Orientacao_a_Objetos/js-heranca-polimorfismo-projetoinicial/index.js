import {Cliente} from "./Contas/Cliente.js";
import { ContaCorrente } from "./Contas/ContaCorrente.js";
import { ContaPoupanca } from "./Contas/ContaPoupanca.js";
import { ContaSalario } from "./Contas/ContaSalario.js";

const cliente1 = new Cliente("Ricardo", 1122334455);

//Cliente Ricardo --
const contaCorrenteRicardo = new ContaCorrente(cliente1, 1001);
const contaPoupanca = new ContaPoupanca(50, cliente1, 1001);
const contaSalario = new ContaSalario(cliente1);
contaSalario.depositar(150);
contaSalario.sacar(50);

console.log(ContaSalario);





