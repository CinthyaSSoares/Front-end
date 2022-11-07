export function valida(input) {
    const tipoDeInput = input.dataset.tipo;

    if(validadores[tipoDeInput]) {
        validadores[tipoDeInput](input)
    }
}

const validadores = {
    dataNascimento:input => validaDataNascimento(input);
}

function validaDataNascimento(input) {
    const dataRecebida = new Date(input.value);
    let mensagem = '';

    if(!maiorQue18anos(dataRecebida)) {
    mensagem = 'Você deve ser maior que 18 anos para se cadastrar.';
    }
    input.setCustomValidity(mensagem);
}

function maiorQue18anos(data) {
    const dataAtual = new Date(); //sem preencher fica na data atual
    const dataMais18 = new Date(data.getUTCFullYear() + 18, data.getUTCMonth(), data.getUTCDate());

    return dataMais18 <= dataAtual
}