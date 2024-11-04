<%@ page import="org.example.teste.Model.Adm" %>
<%@ page import="java.util.List" %>
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
        <form action="mudarADM" >
            <label for="chk" aria-hidden="true">Delfis!</label>

            <p>Nome</p>
            <input type="text" name="name" placeholder="Name" value="${adms.nome}" required>
            <p>Login</p>
            <input type="text" name="Login" placeholder="Login" value=" ${adms.login}" required>
            <p>Senha</p>
            <input type="password" name="password" placeholder="Password" value="${adms.senha}" required>
            <p>Data Nascimento</p>
            <input type="date" name="dt_nasc" placeholder="Date of birth" value="${adms.data_nascimento}" required>
            <p>Email</p>
            <input type="text" name="email" placeholder="Email" value="${adms.email}" required>
            <input type="hidden" name="id_adm" value="${adms.id_adm}">
            <button class="sla">Atualizar</button>
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