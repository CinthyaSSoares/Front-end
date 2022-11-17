import {Cliente} from "./Contas/Cliente.js";

import { Diretor } from "./Funcionarios/Diretor.js";
import { Funcionario } from "./Funcionarios/Funcionario.js";
import { Gerente } from "./Funcionarios/Gerente.js";
import { Autenticacao } from "./SistemaDeAutentificacao/Autenticacao.js";

const diretor = new Diretor("Ana", 10000, 12345678900);
diretor.cadastrarSenha("11223344")

const gerente = new Gerente("Paula", 5000, 98765432100);
gerente.cadastrarSenha("55667788")


 const estaLogado = Autenticacao.login(diretor, "11223344");

 console.log(estaLogado);