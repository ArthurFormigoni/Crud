<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Usuario_Moedas" %>

<!-- Código HTML - Início -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - Lista de Moedas</title>

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
            <h2>Moedas</h2>
            <form action="pagina_aumentae_moedas"><button class="add-user-btn" type="submit">Adicionar Moedas</button></form>
        </div>

        <div class="table">
            <div class="table-header">
                <div class="column">ID</div>
                <div class="column">Nome</div>
                <div class="column">Total_moedas</div>
                <div class="column"></div> <!-- Coluna vazia para ações (editar/excluir) -->
            </div>

            <!-- Iterando sobre a lista de administradores -->
            <%
                List<Usuario_Moedas> moedas = (List<Usuario_Moedas>) request.getAttribute("listaMoedas");
                if (moedas != null && !moedas.isEmpty()) {
                    for (Usuario_Moedas coin : moedas) {
            %>
            <jsp:include page="/Mostra_JSP/mostra_moedas.jsp">
                <jsp:param name="id_usuario" value="<%= coin.getId_usuario() %>" />
                <jsp:param name="nome" value="<%= coin.getNome() %>" />
                <jsp:param name="total_moedas" value="<%= coin.getTotal_moedas() %>" />
                <jsp:param name="id_moedas" value="<%= coin.getId_moedas() %>" />
            </jsp:include>
            <%
                }
            } else {
            %>
            <div>Nenhuma moeda encontrada.</div> <!-- Mensagem de que nada foi encontrado -->
            <%
                }
            %>
        </div>
    </div>
</div>
<script src="java_script/script.js"></script>
</body>
</html>
<!-- Código HTML - Fim -->
