<%@ page import="org.example.teste.Model.Adm" %> <!-- Importa a classe 'Adm' para manipulação dos dados do administrador -->
<%@ page import="java.util.List" %> <!-- Importa a classe 'List' para manipulação de listas de objetos -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo como HTML e a codificação como UTF-8 -->
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
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox que pode ser usado para controlar visibilidade ou interação com o conteúdo -->
    <div class="signup"> <!-- Div que envolve o formulário -->
        <!-- Formulário para enviar a quantidade de moedas -->
        <form action="mudarMoedas" method="post">
            <label for="chk" aria-hidden="true"></label> <!-- Label associada ao checkbox (usada para controle de exibição) -->

            <h1>DELFIS!</h1> <!-- Título do formulário -->

            <p>Quantidade</p> <!-- Descrição do campo -->
            <input type="text" name="quantidade" placeholder="quantidade"> <!-- Campo para digitar a quantidade de moedas -->

            <!-- Campos escondidos que enviam o ID do usuário e o ID da moeda -->
            <input type="hidden" name="usuario_id" placeholder="ID_Usuario" value="${moedas.id_usuario}" />
            <input type="hidden" name="id_moedas" placeholder="ID_Moedas" value="${moedas.id_moedas}" />

            <!-- Botão de envio do formulário -->
            <button class="sla">Atualizar</button>
        </form>
    </div>

    <!-- Verificação de erro: Se a variável 'verificar' for igual a 1, exibe uma mensagem de erro -->
    <%
        int teste = 0;
        if (request.getAttribute("verificar") != null) {
        teste = (int) request.getAttribute("verificar");
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro quando os dados são incorretos -->
    <% }} %> <!-- Fim do bloco de verificação -->
</div>
</body>
</html>
