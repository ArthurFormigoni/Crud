<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.UsuariosPremium" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - User List</title>
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
            <h2>Users</h2>
            <form action="adicionar_premuim"><button type="submit" class="add-user-btn">Adicionar premuim a um usuario</button></form>
        </div>

        <div class="table">
            <div class="table-header">
                <div class="column">id</div>
                <div class="column">id_Ranking</div>
                <div class="column">id_Plano</div>
                <div class="column">Nome</div>
                <div class="column">Email</div>
                <div class="column">Senha</div>
                <div class="column">Data de Nascimento</div>
                <div class="column">Level</div>
                <div class="column">Pontos</div>
                <div class="column">Data de criação</div>

                <div class="column"></div> <!-- Empty column for actions (edit/delete) -->
            </div>

            <!-- Iterando sobre a lista de usuários -->
            <%
                List<UsuariosPremium> usuarios = (List<UsuariosPremium>) request.getAttribute("listaUsuarios");
                if (usuarios != null && !usuarios.isEmpty()) {
                    for (UsuariosPremium usuario : usuarios) {
            %>
            <jsp:include page="/Mostra_JSP/mostra_user.jsp">
                <jsp:param name="id" value="<%= String.valueOf(usuario.getId_usuario()) %>" />
                <jsp:param name="id_ranking" value="<%= String.valueOf(usuario.getFk_ranking()) %>" />
                <jsp:param name="id_plano" value="<%= String.valueOf(usuario.getFk_plano()) %>" />
                <jsp:param name="nome" value="<%= usuario.getNome() %>" />
                <jsp:param name="email" value="<%= usuario.getEmail() %>" />
                <jsp:param name="senha" value="<%= usuario.getSenha() %>" />
                <jsp:param name="data_nascimento" value="<%= usuario.getDt_nasc() %>" />
                <jsp:param name="level" value="<%= String.valueOf(usuario.getNivel()) %>" />
                <jsp:param name="pontos" value="<%= String.valueOf(usuario.getPontos()) %>" />
                <jsp:param name="data_criacao" value="<%= usuario.getDt_criacao() %>" />
            </jsp:include>
            <%
                }
            } else {
            %>
            <div>Nenhum usuário encontrado.</div>
            <%
                }
            %>
        </div>
    </div>
</div>
</body>
</html>
