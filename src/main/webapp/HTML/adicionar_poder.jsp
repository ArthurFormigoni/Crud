<%--
  Created by IntelliJ IDEA.
  User: joaocamargo-ieg
  Date: 28/10/2024
  Time: 08:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Adicionar Poder</title>
    <link rel="stylesheet" href="CSS/styleADM.css">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">

    <div class="signup">
        <form action="adicionarPoder" >
            <label for="chk" aria-hidden="true">Delfis!</label>
            <input type="text" name="name" placeholder="Name" required>
            <input type="text" name="qtd" placeholder="Quantidade" required>
            <input type="number" name="preco" placeholder="Preco" required>
            <button class="sla">Adicionar</button>
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

</body>
</html>
