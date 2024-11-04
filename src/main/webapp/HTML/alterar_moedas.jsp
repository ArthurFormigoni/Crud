<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal</title>
    <link rel="stylesheet" href="CSS/styleADM.css">
</head>
<body>
<div class="main"> <!-- Container principal da página -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto para alternar exibição -->

    <div class="signup"> <!-- Seção do formulário -->
        <form action="aumentar_moedas" method="post"> <!-- Especifica o método de envio como POST -->
            <label for="chk" aria-hidden="true">Delfis!</label> <!-- Título do formulário -->

            <p>Quantidade</p>
            <input type="text" name="quantidade" placeholder="quantidade" required> <!-- Campo para quantidade -->

            <p>FK_Usuário</p>
            <input type="text" name="fk_usuario" placeholder="fk_usuario" required> <!-- Campo para ID do usuário -->

            <p>ID_Moedas</p>
            <input type="text" name="id_moedas" placeholder="id_moedas" required> <!-- Campo para ID das moedas -->

            <button type="submit" class="sla">Adicionar</button> <!-- Botão para enviar o formulário -->
        </form>
    </div>

    <%-- Verifica e exibe uma mensagem de erro, se houver --%>
    <%
        int teste = 0;
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar");
        }

        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro -->
    <% } %>
</div>
</body>
</html>

