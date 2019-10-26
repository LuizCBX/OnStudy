/**
 * Simples slide show
 * @author Luiz  
 * */

let intervalo = 3000

function slide1() {
    document.getElementById('banner').src = 'imagens/banner2.jpg'
    //a linha abaixo "executa" a função após 3 segundos
    setTimeout('slide2()', intervalo)
}

function slide2() {
    document.getElementById('banner').src = 'imagens/banner1.jpg'
    setTimeout('slide1()', intervalo)
}

/*function slide3() {
    document.getElementById('banner').src = 'banner3.jpg'
    setTimeout('slide1()', intervalo)
}*/