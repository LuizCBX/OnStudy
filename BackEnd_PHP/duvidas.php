<?php include 'header.php'; ?>

<div class="back">Dúvidas</div>

<div class="Destaque">
    <h1>Envie sua dúvida!</h1>
    <h3>&#9993; Utilize o formulário abaixo para enviar sua mensagem de dúvida.</h3>
    <div id="contato">
        <form action="formulario.php" method="POST">
            <input type="text" name="nome" placeholder="Nome">
            <input type="text" name="email" placeholder="E-mail">
            <input type="text" name="telefone" placeholder="Telefone">
            <textarea name="mensagem" placeholder="Mensagem"></textarea>
            <input type="submit" value="ENVIAR" style="cursor: pointer">
        </form>
    </div>
</div>



<?php include 'footer.php'; ?>