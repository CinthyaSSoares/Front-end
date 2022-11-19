import { Diretor } from "./Funcionarios/Diretor.js";
import { Gerente } from "./Funcionarios/Gerente.js";
import { Cliente } from "./Cliente.js";
import { Autenticacao } from "./SistemaDeAutentificacao/Autenticacao.js";

const diretor = new Diretor("Ana", 10000, 12345678900);
diretor.cadastrarSenha("11223344")

const gerente = new Gerente("Paula", 5000, 98765432100);
gerente.cadastrarSenha("55667788")

const cliente = new Cliente("Lais", 12121212, "123")

const diretorEstaLogado = Autenticacao.login(diretor, "11223344");
const gerenteEstaLogado = Autenticacao.login(gerente, "55667788");

const clienteEstaLogado = Autenticacao.login(cliente, "123");

console.log(diretorEstaLogado);
console.log(gerenteEstaLogado);
console.log(clienteEstaLogado);