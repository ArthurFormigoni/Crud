<%@ page import="org.example.teste.Model.Adm" %> <!-- Importa a classe Adm do pacote Model -->
<%@ page import="java.util.List" %> <!-- Importa a classe List para uso posterior -->
<!DOCTYPE html> <!-- Define o tipo de documento como HTML -->
<html lang="pt-br"> <!-- Define o idioma da página como português do Brasil -->
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura o viewport para dispositivos móveis -->
    <title>Portal</title> <!-- Define o título da página -->
    <link rel="stylesheet" href="CSS/styleUpdateUser.css"> <!-- Link para a folha de estilo CSS -->
</head>
<body>
<div class="main"> <!-- Início da seção principal -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto para controle de interação -->
    <div class="signup"> <!-- Início do formulário para atualizar informações do usuário -->
        <form action="mudarUser"> <!-- Formulário que envia dados para 'mudarUser' -->
            <label for="chk" aria-hidden="true">Delfis!</label> <!-- Rótulo oculto para o formulário -->

            <p>Nome</p> <!-- Rótulo para o campo de nome -->
            <input type="text" name="name" placeholder="Name" value="${user.nome}" required> <!-- Campo para o nome do usuário -->

            <p>Senha</p> <!-- Rótulo para o campo de senha -->
            <input type="password" name="password" placeholder="Password" value="${user.senha}" required> <!-- Campo para a senha do usuário -->

            <p>Data Nascimento</p> <!-- Rótulo para o campo de data de nascimento -->
            <input type="date" name="dt_nasc" placeholder="Date of birth" value="${user.dt_criacao}" required> <!-- Campo para a data de nascimento -->

            <p>Email</p> <!-- Rótulo para o campo de email -->
            <input type="text" name="email" placeholder="Email" value="${user.email}" required> <!-- Campo para o email do usuário -->

            <p>Pontos</p> <!-- Rótulo para o campo de pontos -->
            <input type="number" name="pontos" placeholder="Pontos" value="${user.pontos}" required> <!-- Campo para os pontos do usuário -->

            <input type="hidden" name="id_user" value="${user.id_usuario}"> <!-- Campo oculto para o ID do usuário -->
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
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro quando os dados estão incorretos -->
    <% } %> <!-- Fim do bloco de verificação de erro -->
</div>
</body>
</html>
