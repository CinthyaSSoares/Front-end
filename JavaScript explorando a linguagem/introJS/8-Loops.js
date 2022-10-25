console.log(`\n Trabalhando com condicionais`);

const listaDeDestinos = new Array(
    `Salvador`, //0
    `São Paulo`, //1
    `Rio de Janeiro` //2
);

const idadeComprador = 16;
const estaAcompanhada = true;
let temPasssagemComprada = true;
const destino = "Rio de Janeiro"; //nova determinação

console.log("\n Destinos possíveis:");
console.log(listaDeDestinos);

const podeComprar = idadeComprador >= 18 || estaAcompanhada == true; 

let contador = 0;
let destinoExiste = false;

while(contador < 3) {
    if(listaDeDestinos[contador] == destino){
    destinoExiste = true;
        break;
    }
    contador += 1; //adiciona mais um para não repetir o loop
}

console.log("Destino existe: ", destinoExiste);