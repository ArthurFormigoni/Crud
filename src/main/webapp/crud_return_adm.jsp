<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="Classes.Adm_" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - Lista de Administradores</title>

    <link rel="stylesheet" href="style2.css">
</head>

<body>
<div id="header">
    <div id="header-content">
        <h1>Delfis</h1>
        <div id="menu">
            <a href="">Usuário Premium</a>
            <a href="">Usuários</a>
            <a href="">ADM</a>
            <a href="">Moedas</a>
        </div>
    </div>
</div>
<br><br><br><br>
<div class="container">
    <header>
        <h1>CRUD-Delfis!</h1>
    </header>

    <div class="content">
        <div class="headers">
            <h2>Administradores</h2>
            <button class="add-user-btn">Adicionar Administrador</button>
        </div>

        <div class="table">
            <div class="table-header">
                <div class="column">imagem_url</div>
                <div class="column">id_adm</div>
                <div class="column">login</div>
                <div class="column">nome</div>
                <div class="column">email</div>
                <div class="column">senha</div>
                <div class="column">dt_nasc</div>
                <div class="column">dt_criacao</div>
                <div class="column"></div> <!-- Coluna vazia para ações (editar/excluir) -->
            </div>

            <!-- Iterando sobre a lista de administradores -->
            <%
                List<Adm_> administradores = (List<Adm_>) request.getAttribute("listaADM");
                if (administradores != null && !administradores.isEmpty()) {
                    for (Adm_ adm : administradores) {
            %>
            <jsp:include page="mostra_adm.jsp">
                <jsp:param name="imagem_url" value="<%= adm.getImagem_url() %>" />
                <jsp:param name="id_adm" value="<%= adm.getId_adm() %>" />
                <jsp:param name="login" value="<%= adm.getLogin() %>" />
                <jsp:param name="nome" value="<%= adm.getNome() %>" />
                <jsp:param name="email" value="<%= adm.getEmail() %>" />
                <jsp:param name="senha" value="<%= adm.getSenha() %>" />
                <jsp:param name="dt_nasc" value="<%= adm.getData_nascimento() %>" />
                <jsp:param name="dt_criacao" value="<%= adm.getDt_criacao() %>" />
            </jsp:include>

            <%
                }
            } else {
            %>
            <div>Nenhum administrador encontrado.</div>
            <%
                }
            %>
        </div>
    </div>
</div>

</body>
</html>
