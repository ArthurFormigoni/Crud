<%@ page import="org.example.teste.Model.Adm_" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal</title>
    <link rel="stylesheet" href="CSS/styleADM.css">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">
    <div class="signup">
        <form action="mudarUser" >
            <label for="chk" aria-hidden="true">Delfis!</label>
            <input type="text" name="name" placeholder="Name" value="${user.nome}" required>
            <input type="password" name="password" placeholder="Password" value="${user.senha}" required>
            <input type="date" name="dt_nasc" placeholder="Date of birth" value="${user.dt_criacao}" required>
            <input type="text" name="email" placeholder="Email" value="${user.email}" required>
            <input type="number" name="pontos" placeholder="Pontos" value="${user.pontos}" required>
            <input type="hidden" name="id_user" value="${user.id_usuario}">
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