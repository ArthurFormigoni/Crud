<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal</title>
    <link rel="stylesheet" href="CSS/styleUpdateUser.css">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">

    <div class="signup">
        <form action="cadastrar_adm" >
            <label for="chk" aria-hidden="true">Delfis!</label>
            <p>Nome</p>
            <input type="text" name="name" placeholder="Name" required>
            <p>Login</p>
            <input type="text" name="Login" placeholder="Login" required>
            <p>Senha</p>
            <input type="password" name="password" placeholder="Password" required>
            <p>Data Nascimento</p>
            <input type="date" name="dt_nasc" placeholder="Date of birth" required>
            <p>Email</p>
            <input type="text" name="email" placeholder="Email" required>
            <button class="sla">Cadastrar</button>
        </form>
    </div>
    <% int teste=0;
        if (request.getAttribute("verificar") != null){
            teste = (int) request.getAttribute("verificar");
        }
        if (teste==1){
    %>
    <p id="incorreto">Dados inseridos incorretamente</p>
    <%}

    %>

</div>
</body>
</html>