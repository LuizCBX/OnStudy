/**
 * Simples slide show
 * @author Luiz  
 * */

let intervalo = 3000


function slide1() {
    document.getElementById('banner').src = 'imagens/nuvem.png'
    //a linha abaixo "executa" a função após 3 segundos
    setTimeout('slide2()', intervalo)
}

function slide2() {
    document.getElementById('banner').src = 'imagens/ti2.jpg'
    setTimeout('slide3()', intervalo)
}

function slide3() {
    document.getElementById('banner').src = 'imagens/placa.jpg'
    setTimeout('slide4()', intervalo)
}

function slide4() {
    document.getElementById('banner').src = 'imagens/web3.jpg'
    setTimeout('slide5()', intervalo)
}

function slide5() {
    document.getElementById('banner').src = 'imagens/hard.jpg'
    setTimeout('slide6()', intervalo)
}


function slide6() {
    document.getElementById('banner').src = 'imagens/firewall.png'
    setTimeout('slide1()', intervalo)
}