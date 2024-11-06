<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link
            href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
            rel='stylesheet'>
    <link rel="stylesheet" href="CSS/style.css">
    <title>Document</title>
</head>
<body>
<main class="container">
    <form action="login" method="post">
        <h1>Login</h1>
        <div class="input-box">
            <input type="text" name="txt" placeholder="Usuário">
            <i class="bx bxs-user"></i>
        </div>
        <div class="input-box">
            <input type="password" name="pswd" placeholder="Senha">
            <i class="bx bxs-lock-alt"></i>
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
        <button type="submit" name="pswd" class="login">Login</button>
    </form>

</main>
</body>
</html>