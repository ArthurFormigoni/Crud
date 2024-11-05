<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura a responsividade da página -->
    <title>Portal</title> <!-- Título da página exibido na aba do navegador -->
    <link rel="stylesheet" href="CSS/styleUpdateUser.css"> <!-- Link para o arquivo CSS de estilo -->
</head>
<body>
<div class="main"> <!-- Contêiner principal da página -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox para alternar entre formulários -->

    <div class="signup"> <!-- Seção de cadastro -->
        <form action="cadastrar_adm"> <!-- Formulário para cadastrar um novo administrador -->
            <label for="chk" aria-hidden="true">Delfis!</label> <!-- Rótulo para o checkbox -->
            <p>Nome</p>
            <input type="text" name="name" placeholder="Name" required> <!-- Campo para nome, obrigatório -->
            <p>Login</p>
            <input type="text" name="Login" placeholder="Login" required> <!-- Campo para login, obrigatório -->
            <p>Senha</p>
            <input type="password" name="password" placeholder="Password" required> <!-- Campo para senha, obrigatório -->
            <p>Data Nascimento</p>
            <input type="date" name="dt_nasc" placeholder="Date of birth" required> <!-- Campo para data de nascimento, obrigatório -->
            <p>Email</p>
            <input type="text" name="email" placeholder="Email" required> <!-- Campo para email, obrigatório -->
            <button class="sla">Cadastrar</button> <!-- Botão para enviar o formulário -->
        </form>
    </div>

    <div class="lista"> <!-- Seção de restrições -->
        <ul>
            <li>Nome: no mínimo 3 digitos</li> <!-- Regras para o nome -->
            <li>Login: no mínimo 5 digitos</li> <!-- Regras para o login -->
            <li>Senha: deve conter numeros e letras</li> <!-- Regras para a senha -->
            <li>Email: no mínimo 4 digitos antes do @</li> <!-- Regras para o email -->
        </ul>
    </div>

    <%
        // Verifica se há um atributo "verificar" na requisição
        int teste=0;
        if (request.getAttribute("verificar") != null){
            teste = (int) request.getAttribute("verificar"); // Atribui o valor do atributo à variável teste
        }
        // Exibe mensagem de erro se o valor de teste for 1
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente, leia atentamente as restrições</p> <!-- Mensagem de erro -->
    <% } %> <!-- Fim do bloco condicional -->
</div>
</body>
</html>
