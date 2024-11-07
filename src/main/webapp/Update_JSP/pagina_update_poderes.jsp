<%@ page import="org.example.teste.Model.Adm" %> <!-- Importa a classe 'Adm' para manipulação dos dados administrativos -->
<%@ page import="java.util.List" %> <!-- Importa a classe 'List' para manipulação de listas de objetos -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo como HTML e a codificação para UTF-8 -->
<!DOCTYPE html>
<html lang="pt-br"> <!-- Define o idioma da página como português brasileiro -->
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres para UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Define a visualização responsiva para dispositivos móveis -->
    <title>Portal</title> <!-- Título da página -->
    <link rel="stylesheet" href="CSS/moedas.css"> <!-- Link para o arquivo CSS que estiliza a página -->
</head>
<body>
<div class="main"> <!-- Div principal que contém o formulário -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox usado para controle de visibilidade ou interação -->
    <div class="signup"> <!-- Div que envolve o formulário -->
        <!-- Formulário para atualizar o power-up -->
        <form action="mudarPoder" method="POST">
            <!-- Campo oculto que envia o ID do power-up -->
            <input type="hidden" name="id_powerup" value="${param.id_powerup}" />

            <h1>DELFIS!</h1> <!-- Título do formulário -->

            <!-- Campo de entrada para o nome do power-up -->
            <label for="nome">Nome do Power-up:</label>
            <input type="text" id="nome" name="nome" value="${param.nome}" required />

            <!-- Campo de entrada para a quantidade -->
            <label for="quantidade">Quantidade:</label>
            <input type="text" id="quantidade" name="quantidade" value="${param.quantidade}" required />

            <!-- Campo de entrada para o preço em moedas -->
            <label for="preco">Preço (em Moedas):</label>
            <input type="text" step="0.01" id="preco" name="preco" value="${param.preco}" required />

            <!-- Botão para atualizar o power-up -->
            <button class="sla">Atualizar</button>
        </form>
    </div>

    <!-- Verificação de erro: Se a variável 'verificar' for igual a 1, exibe a mensagem de erro -->
    <%
        int teste = 0;
        if (request.getAttribute("verificar") != null) {
        teste = (int) request.getAttribute("verificar");
        }
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro quando os dados são inseridos incorretamente -->
    <% } %> <!-- Fim do bloco de verificação -->
</div>
</body>
</html>
