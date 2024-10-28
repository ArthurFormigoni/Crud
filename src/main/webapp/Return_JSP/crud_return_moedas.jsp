<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Usuario_Moedas" %>


<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - Lista de Moedas</title>

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
            <h2>Moedas</h2>
            <form action="pagina_aumentae_moedas"><button class="add-user-btn" type="submit">Adicionar Moedas</button></form>
        </div>

        <div class="table">
            <div class="table-header">
                <div class="column">id_usuario</div>
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
            </jsp:include>

            <%
                }
            } else {
            %>
            <div>Nenhuma moeda encontrada.</div>
            <%
                }
            %>
        </div>
    </div>
</div>

</body>
</html>
