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
        <form action="mudarPoder" method="POST">
            <!-- Campo ID (oculto) -->
            <input type="hidden" name="id_powerup" value="${param.id_powerup}" />
            <h1>DELFIS!</h1>
            <label for="nome">Nome do Power-up:</label>
            <input type="text" id="nome" name="nome" value="${param.nome}" required />

            <label for="quantidade">Quantidade:</label>
            <input type="text" id="quantidade" name="quantidade" value="${param.quantidade}" required />

            <label for="preco">Preço (em Moedas):</label>
            <input type="text" step="0.01" id="preco" name="preco" value="${param.preco}" required />

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