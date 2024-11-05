<%@ page import="org.example.teste.Model.Adm" %> <!-- Importa a classe Adm do pacote Model -->
<%@ page import="java.util.List" %> <!-- Importa a classe List para uso posterior -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo e a linguagem do JSP -->
<!DOCTYPE html> <!-- Define o tipo de documento como HTML -->
<html lang="pt-br"> <!-- Define o idioma da página como português do Brasil -->
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura o viewport para dispositivos móveis -->
    <title>Portal</title> <!-- Define o título da página -->
    <link rel="stylesheet" href="CSS/styleADM.css"> <!-- Link para a folha de estilo CSS -->
</head>
<body>
<div class="main"> <!-- Início da seção principal -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto para interações -->
    <div class="signup"> <!-- Início do formulário para atualizar moedas -->
        <form action="mudarMoedas" method="post"> <!-- Formulário que envia dados para 'mudarMoedas' -->
            <label for="chk" aria-hidden="true">Delfis!</label> <!-- Rótulo oculto -->
            <p>Quantidade</p> <!-- Rótulo para o campo de quantidade -->
            <input type="text" name="quantidade" placeholder="quantidade"> <!-- Campo para inserir a quantidade -->
            <input type="hidden" name="usuario_id" value="${moedas.id_usuario}" /> <!-- ID do usuário (oculto) -->
            <input type="hidden" name="id_moedas" value="${moedas.id_moedas}" /> <!-- ID das moedas (oculto) -->
            <button class="sla">Atualizar</button> <!-- Botão para enviar o formulário -->
        </form>
    </div>

    <%
        int teste = 0; // Inicializa variável para controle de erro
        // Verifica se existe um atributo 'verificar' na requisição
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar"); // Converte o atributo para inteiro
        }
        // Se 'teste' for igual a 1, exibe mensagem de erro
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro -->
    <% } %> <!-- Fim do bloco de verificação de erro -->
</div>
</body>
</html>
