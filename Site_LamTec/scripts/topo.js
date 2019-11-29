/**
 * Função jQuery para voltar ao topo
 * @author José de Assis
 * <img src="imagens/seta_topo.png" class="Top" alt="Seta topo" title="Topo do site">	
 */
 $(document).ready(function(){
	// .click(function(){}); -> quando clicar no objeto identificado pela classe .Top
	$(function(){
        $('.Top').click(function(){
			//vá para o topo A TAG <body>
            $('html,body').animate({scrollTop: 0},'slow');
        });
   });
 });
