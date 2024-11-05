<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Login - Efeito de Vidro</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<div class="login-container">
    <img src="Imagens/logo.svg" alt="Logo" class="logo">
    <div class="login-title">Login</div>

    <form action="login" method="post">
        <div class="input-group">
            <label class="input-label">Usuário</label>
            <input type="text" name="txt" class="input-field" placeholder="usuário">
        </div>

        <div class="input-group">
            <label class="input-label">Senha</label>
            <input type="password" name="pswd" class="input-field" placeholder="senha">
        </div>
        <% int teste=0;
            if (request.getAttribute("teste") != null){
                teste = (int) request.getAttribute("teste");
            }
            if (teste==1){
        %>
        <p id="incorreto">Senha ou usuario incorreto</p>
        <%}
        %>
        <button class="sign-in-button">Entrar</button>
    </form>
</div>
</body>
</html>