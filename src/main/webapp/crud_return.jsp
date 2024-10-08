<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="Classes.UsuariosPremium" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - User List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style2.css">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container-fluid">

        <a class="navbar-brand" href="#">Delfis! ADM</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Usuário Premium</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">ADM</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Moedas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Poderes</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <header>
        <h1>CRUD-Delfis!</h1>

    </header>

    <div class="content">
        <div class="header">
            <h2>Users</h2>
            <button class="add-user-btn">Adicionar premuim a um usuario</button>
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
            <jsp:include page="mostra_user.jsp">
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
