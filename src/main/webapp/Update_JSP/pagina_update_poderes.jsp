<%@ page import="org.example.teste.Model.Adm" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal</title>
    <link rel="stylesheet" href="CSS/moedas.css">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">
    <div class="signup">
        <form action="mudarPoder" method="post">
            <label for="chk" aria-hidden="true"></label>
            <h1>DELFIS!</h1>
            <p>Nome</p>
            <input type="text" name="nome" placeholder="nome">
            <p>Quantidade</p>
            <input type="text" name= "quantidade" placeholder= "quantidade">
            <p>Preço</p>
            <input type="text" name= "preco" placeholder= "preco">
            <input type="hidden" name="poderes" placeholder="poderes" value="${poderes.id_powerup}" />
            <button class="sla">Atualizar</button>
        </form>

    </div>
    <%
        int teste = 0;
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar");
        }
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p>
    <% } %>
</div>
</body>
</html>