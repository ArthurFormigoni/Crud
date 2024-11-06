<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Definição de metadados e links para estilos e ícones -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Link para a biblioteca de ícones Boxicons -->
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

    <!-- Link para o arquivo de estilo CSS personalizado -->
    <link rel="stylesheet" href="CSS/style.css">

    <title>Login</title>
</head>
<body>
<main class="container">
    <!-- Formulário de login com método POST para enviar dados ao servidor -->
    <form action="login" method="post">
        <!-- Título do formulário de login -->
        <h1>Login</h1>

        <!-- Campo de entrada para o nome de usuário -->
        <div class="input-box">
            <input type="text" name="txt" placeholder="Usuário">
            <!-- Ícone de usuário ao lado do campo de entrada -->
            <i class="bx bxs-user"></i>
        </div>

        <!-- Campo de entrada para a senha -->
        <div class="input-box">
            <input type="password" name="pswd" placeholder="Senha">
            <!-- Ícone de cadeado ao lado do campo de entrada -->
            <i class="bx bxs-lock-alt"></i>
        </div>

        <!-- Bloco JSP para verificação e exibição de mensagem de erro -->
        <%
            // Inicializa a variável 'teste' com valor 0
            int teste = 0;

            // Verifica se o atributo "teste" foi enviado na requisição
            if (request.getAttribute("teste") != null) {
                teste = (int) request.getAttribute("teste"); // Atribui o valor de "teste" recebido da requisição
            }

            // Se teste for igual a 1, exibe mensagem de erro
            if (teste == 1) {
        %>
        <!-- Mensagem de erro exibida se o login ou a senha estiverem incorretos -->
        <p id="incorreto">Senha ou usuário incorreto</p>
        <%
            }
        %>

        <!-- Botão de envio do formulário -->
        <button type="submit" name="pswd" class="login">Login</button>
    </form>
</main>
</body>
</html>
