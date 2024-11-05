<%@ page import="org.example.teste.Model.Adm" %> <!-- Importa a classe Adm do pacote Model -->
<%@ page import="java.util.List" %> <!-- Importa a classe List para manipulação de listas -->
<!DOCTYPE html> <!-- Define o tipo de documento como HTML-->
<html lang="pt-br"> <!-- Define o idioma da página como português do Brasil -->
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura o viewport para dispositivos móveis -->
    <title>Portal</title> <!-- Define o título da página -->
    <link rel="stylesheet" href="CSS/styleUpdateUser.css"> <!-- Link para a folha de estilo CSS -->
</head>
<body>
<div class="main"> <!-- Início da seção principal da página -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto, usado para interações no formulário -->
    <div class="signup"> <!-- Início do formulário de atualização do administrador -->
        <form action="mudarADM"> <!-- Define a ação do formulário para mudar os dados do administrador -->
            <label for="chk" aria-hidden="true">Delfis!</label> <!-- Rótulo oculto para o checkbox -->

            <p>Nome</p> <!-- Rótulo para o campo de nome -->
            <input type="text" name="name" placeholder="Name" value="${adms.nome}" required> <!-- Campo de entrada para o nome do administrador -->
            <p>Login</p> <!-- Rótulo para o campo de login -->
            <input type="text" name="Login" placeholder="Login" value="${adms.login}" required> <!-- Campo de entrada para o login do administrador -->
            <p>Senha</p> <!-- Rótulo para o campo de senha -->
            <input type="password" name="password" placeholder="Password" value="${adms.senha}" required> <!-- Campo de entrada para a senha do administrador -->
            <p>Data Nascimento</p> <!-- Rótulo para o campo de data de nascimento -->
            <input type="date" name="dt_nasc" placeholder="Date of birth" value="${adms.data_nascimento}" required> <!-- Campo de entrada para a data de nascimento -->
            <p>Email</p> <!-- Rótulo para o campo de e-mail -->
            <input type="text" name="email" placeholder="Email" value="${adms.email}" required> <!-- Campo de entrada para o e-mail do administrador -->
            <input type="hidden" name="id_adm" value="${adms.id_adm}"> <!-- Campo oculto que armazena o ID do administrador -->
            <button class="sla">Atualizar</button> <!-- Botão para submeter o formulário -->
        </form>
    </div>

    <%
        int teste=0; // Inicializa a variável teste para controle de erros
        // Verifica se o atributo "verificar" foi passado na requisição
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar"); // Converte o atributo para um inteiro
        }
        // Se teste for igual a 1, exibe uma mensagem de erro
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro ao usuário -->
    <% } %> <!-- Fim da verificação de erro -->

</div>
</body>
</html>
