import { valida } from './validacao.js';

const inputs = document.querySelectorAll('input'); //pegando todos os inputs

inputs.forEach(input => {
    input.addEventListener('blur', (evento) =>{
        valida(evento.target);
    })
})
