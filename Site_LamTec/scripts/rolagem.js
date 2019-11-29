/**
 * Função jQuery
 * @author Luiz
 * <img src="imagens/seta_topo.png" class="Top" alt="Seta topo" title="Topo do site">	
 */
$(document).ready(function(){
	// .click(function(){}); -> quando clicar no objeto identificado pela classe .Top
	$(function(){
        $('#empresa').click(function(){
			//vá para o topo A TAG <body>
            $('body').animate({scrollTop: 0},'slow');
        });
        $('#prodserv').click(function(){
			//vá para o topo A TAG <body>
            $('prodserv').animate({scrollTop: 0},'slow');
        });
        $('#contato').click(function(){
			//vá para o topo A TAG <body>
            $('footer').animate({scrollTop: 0},'slow');
        });

   });
 });
