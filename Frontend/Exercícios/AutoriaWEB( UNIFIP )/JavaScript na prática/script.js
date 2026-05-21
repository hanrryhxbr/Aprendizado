const botaoMensagem = document.getElementById('botaoMensagem')
const mensagem = document.getElementById('mensagem')

const botaoAlterarTexto = document.getElementById('botaoAlterarTexto')
const textoCard = document.getElementById('textoCard')

const botaoSomar = document.getElementById('botaoSomar')
const botaoSubtrair = document.getElementById('botaoSubtrair')
const botaoResetar = document.getElementById('botaoResetar')
const contadorValor = document.getElementById('contadorValor')

const inputNome = document.querySelector('#inputNome')
const botaoSaudacao = document.querySelector('#botaoSaudacao')
const saidaNome = document.querySelector('#saidaNome')

botaoMensagem.addEventListener('click', function() {
    let nome = 'Romeryto Hanrry'
    mensagem.textContent = 'Boas vindas ' + nome
})

botaoAlterarTexto.addEventListener('click', function() {
    let alteracao = 'Este parágrafo foi alterado com Javascript'
    textoCard.textContent = alteracao
})

let result = 0

botaoSomar.addEventListener('click', () => {
    result += 1
    contadorValor.textContent = result
})

botaoSubtrair.addEventListener('click', () => {
    result -= 1
    contadorValor.textContent = result
})

botaoResetar.addEventListener('click', () => {
    contadorValor.textContent = 0
})


botaoSaudacao.addEventListener('click', () => {
    saidaNome.textContent = 'Olá ' + inputNome.value
})