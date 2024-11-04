<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura a página para ser responsiva em dispositivos móveis -->
    <title>Portal</title> <!-- Título da página -->
    <link rel="stylesheet" href="CSS/styleADM.css"> <!-- Link para o arquivo CSS de estilo -->
</head>
<body>
<div class="main"> <!-- Container principal da página -->

    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto para alternar a exibição do formulário -->

    <div class="signup"> <!-- Seção de cadastro de administradores -->
        <form action="cadastrar_adm"> <!-- Formulário para cadastro de administrador -->
            <label for="chk" aria-hidden="true">Delfis!</label> <!-- Título do formulário -->

            <!-- Campos de entrada para informações do administrador -->
            <input type="text" name="name" placeholder="Name" required> <!-- Campo para nome do administrador -->
            <input type="text" name="Login" placeholder="Login" required> <!-- Campo para login -->
            <input type="password" name="password" placeholder="Password" required> <!-- Campo para senha -->
            <input type="date" name="dt_nasc" placeholder="Date of birth" required> <!-- Campo para data de nascimento -->
            <input type="text" name="email" placeholder="Email" required> <!-- Campo para email -->

            <button class="sla">Cadastrar</button> <!-- Botão para enviar o formulário de cadastro -->
        </form>
    </div>

    <%
        int teste = 0; // Inicializa a variável para verificação de erro

        // Verifica se o atributo "verificar" está presente na requisição
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar");
        }

        // Exibe uma mensagem de erro se 'teste' for igual a 1
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro caso os dados estejam incorretos -->
    <% } %>

</div>
</body>
</html>
