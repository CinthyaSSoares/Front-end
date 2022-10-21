console.log(`Trabalhando com condicionais`);

const listaDeDestinos = new Array(
    `Salvador`,
    `São Paulo`,
    `Rio de Janeiro`
);

const idadeComprador = 16;
const estaAcompanhada = true;
const temPasssagemComprada = true;

console.log("Destinos possíveis:");
console.log(listaDeDestinos);

if (idadeComprador >= 18 || estaAcompanhada == true) {
    // || significa "ou"
    console.log("Comprador maior de idade ou esta acompanhado");
    listaDeDestinos.splice(1,1); //removendo item

} else {
    console.log("Não é maior de idade e não está acompanhada então não posso vender");
}

console.log("Embarque: \n\n") // \n pula linha
if(idadeComprador >= 18 || estaAcompanhada == true && temPasssagemComprada) {
    // && significa "e"
    console.log(" BOA VIAGEM!");
} else {
    console.log("Sinto muito mas você não pode embarcar.");
}

console.log(listaDeDestinos);

