<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura a visualização para dispositivos móveis -->
    <title>Portal</title> <!-- Define o título da página -->
    <link rel="stylesheet" href="CSS/moedas.css"> <!-- Importa o arquivo CSS externo para estilizar a página -->
</head>
<body>
<div class="main"> <!-- Container principal da página -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto, possivelmente usado para alternar a exibição do formulário -->

    <div class="signup"> <!-- Seção do formulário de cadastro -->
        <form action="aumentar_moedas"> <!-- Formulário que envia dados para o servidor -->
            <label for="chk" aria-hidden="true"></label> <!-- Rótulo do formulário -->
            <h1>DELFIS!</h1>
            <p>Quantidade</p>
            <input type="text" name="quantidade" placeholder="quantidade" required> <!-- Campo para inserir a quantidade -->
            <p>FK_usuario</p>
            <input type="text" name="fk_usuario" placeholder="fk_usuario" required> <!-- Campo para inserir o ID do usuário -->
            <p>ID_Moedas</p>
            <input type="text" name="id_moedas" placeholder="id_moedas" required> <!-- Campo para inserir o ID das moedas -->
            <button class="sla">Adicionar</button> <!-- Botão para enviar o formulário -->
        </form>
    </div>

    <%
        int teste = 0; // Variável para verificar a condição de erro

        // Se o atributo "verificar" existir na requisição, ele atualiza o valor de 'teste'
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar");
        }

        // Exibe uma mensagem de erro se 'teste' for igual a 1
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro para dados incorretos -->
    <% } %>
</div>
</body>
</html>
