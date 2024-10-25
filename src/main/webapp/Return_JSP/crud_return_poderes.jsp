<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Powerup" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - Lista de Poderes</title>

    <link rel="stylesheet" href="CSS/style2.css">
</head>

<body>
<div id="header">
    <div id="header-content">
        <form action="home"><button type="submit"><a>Delfis</a></button></form>
        <div id="menu">
            <form action="usuarios_premuim"><button type="submit"><a >Usuário Premium</a></button></form>
            <form action="adm"><button type="submit"><a >ADM</a></button></form>
            <form action="moedas"><button type="submit"><a >Moedas</a></button></form>
            <form action="poderes"><button type="submit"><a >Poderes</a></button></form>
            <a href="https://delfis-project.github.io/delfis-restrict-area">Grafico</a>
        </div>
    </div>
</div>
<br><br><br><br>
<div class="container">
    <div id="header2">
        <h1>CRUD-Delfis!</h1>
    </div>

    <div class="content">
        <div class="headers">
            <h2>Poderes</h2>
            <button class="add-user-btn">Adicionar poderes</button>
        </div>

        <div class="table">
            <div class="table-header">
                <div class="column">imagem_loja_url</div>
                <div class="column">nome</div>
                <div class="column">quantidade</div>
                <div class="column">id_powerup</div>
                <div class="column">preco_moedas</div>
                <div class="column">initial_time</div>
                <div class="column">duracao</div>
                <div class="column">final_time</div>
                <div class="column">fk_pagamento_coins</div>
                <div class="column"></div> <!-- Coluna vazia para ações (editar/excluir) -->
            </div>

            <!-- Iterando sobre a lista de administradores -->
            <%
                List<Powerup> poderes = (List<Powerup>) request.getAttribute("listaPoderes");
                if (poderes != null && !poderes.isEmpty()) {
                    for (Powerup pwe : poderes) {
            %>
            <jsp:include page="/Mostra_JSP/mostra_poderes.jsp">
                <jsp:param name="imagem_loja_url" value="<%= pwe.getImagem_loja_url() %>" />
                <jsp:param name="nome" value="<%= pwe.getNome() %>" />
                <jsp:param name="quantidade" value="<%= pwe.getQuantidade() %>" />
                <jsp:param name="id_powerup" value="<%= pwe.getId_powerup() %>" />
                <jsp:param name="preco_moedas" value="<%= pwe.getPreco_moedas() %>" />
                <jsp:param name="initial_time" value="<%= pwe.getInitial_time() %>" />
                <jsp:param name="duracao" value="<%= pwe.getDurucao() %>" />
                <jsp:param name="final_time" value="<%= pwe.getFinal_time() %>" />
            </jsp:include>

            <%
                }
            } else {
            %>
            <div>Nenhum poder encontrado.</div>
            <%
                }
            %>
        </div>
    </div>
</div>

</body>
</html>
