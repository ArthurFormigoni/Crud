<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Adm" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - Lista de Administradores</title>

    <link rel="stylesheet" href="CSS/styleReturn.css">
</head>

<body>
<div class="sidebar">
    <button id="toggleBtn">☰</button>
    <div class="menu">
        <!-- Botão Delfis -->
        <form action="home" class="menu-item">
            <button type="submit">
                <img src="Imagens/home.svg" alt="Ícone Delfis" class="image_icon" >
                <span>Delfis</span>
            </button>
        </form>

        <!-- Botão Usuário Premium -->
        <form action="usuarios_premuim" method="get" class="menu-item">
            <button type="submit" >
                <img src="Imagens/Vector.svg" alt="Ícone Usuário Premium" class="image_icon" >
                <span>Usuário Premium</span>
            </button>
        </form>

        <!-- Botão ADM -->
        <form action="adm" class="menu-item">
            <button type="submit" >
                <img src="Imagens/Vector%201.svg" alt="Ícone ADM" class="image_icon" >
                <span>ADM</span>
            </button>
        </form>

        <!-- Botão Moedas -->
        <form action="moedas" class="menu-item">
            <button type="submit" >
                <img src="Imagens/Group.svg" alt="Ícone Moedas" class="image_icon" >
                <span>Moedas</span>
            </button>
        </form>

        <!-- Botão Poderes -->
        <form action="poderes" class="menu-item">
            <button type="submit" >
                <img src="Imagens/image%2017%20(Traced).svg" alt="Ícone Poderes" class="image_icon" >
                <span>Poderes</span>
            </button>
        </form>

        <!-- Link para Gráfico -->
        <a href="https://delfis-project.github.io/delfis-restrict-area" class="menu-item" >
            <img src="Imagens/image%2018%20(Traced).svg" alt="Ícone Gráfico" class="image_icon" >
            <span>Gráfico</span>
        </a>

    </div>
</div>
<br><br><br><br>
<div class="container">
    <div id="header2">
        <h1>CRUD-Delfis!</h1>
    </div>

    <div class="content">
        <div class="headers">
            <h2>Administradores</h2>
            <form action="pagina_adm"><button class="add-user-btn" type="submit">Adicionar Administrador</button></form>
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
                List<Adm> administradores = (List<Adm>) request.getAttribute("listaADM");
                if (administradores != null && !administradores.isEmpty()) {
                    for (Adm adm : administradores) {
            %>
            <jsp:include page="/Mostra_JSP/mostra_adm.jsp">
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
<script src="java_script/script.js"></script>
</body>
</html>
