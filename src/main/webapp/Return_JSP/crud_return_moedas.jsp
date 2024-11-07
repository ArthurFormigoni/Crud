<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Usuario_Moedas" %>

<!-- Início do código HTML -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!-- Define a codificação de caracteres e a visualização para dispositivos móveis -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>CRUD - Lista de Moedas</title>

    <!-- Link para o arquivo de estilo CSS -->
    <link rel="stylesheet" href="CSS/styleReturn.css">
</head>

<body>
<!-- Barra lateral com o menu de navegação -->
<div class="sidebar">
    <button id="toggleBtn">☰</button> <!-- Botão para abrir/fechar o menu -->
    <div class="menu">
        <!-- Formulários para navegar pelas páginas do sistema -->
        <form action="home" class="menu-item">
            <button type="submit">
                <img src="Imagens/home.svg" alt="Ícone Delfis" class="image_icon" >
                <span>Delfis</span>
            </button>
        </form>

        <form action="usuarios_premium" method="get" class="menu-item">
            <button type="submit" >
                <img src="Imagens/Vector.svg" alt="Ícone Usuário Premium" class="image_icon" >
                <span>Usuário Premium</span>
            </button>
        </form>

        <form action="adm" class="menu-item">
            <button type="submit" >
                <img src="Imagens/Vector%201.svg" alt="Ícone ADM" class="image_icon" >
                <span>ADM</span>
            </button>
        </form>

        <form action="moedas" class="menu-item">
            <button type="submit" >
                <img src="Imagens/Group.svg" alt="Ícone Moedas" class="image_icon" >
                <span>Moedas</span>
            </button>
        </form>

        <form action="poderes" class="menu-item">
            <button type="submit" >
                <img src="Imagens/image%2017%20(Traced).svg" alt="Ícone Poderes" class="image_icon" >
                <span>Poderes</span>
            </button>
        </form>

        <!-- Link para gráficos externos -->
        <a href="https://delfis-project.github.io/delfis-restrict-area" class="menu-item" >
            <img src="Imagens/image%2018%20(Traced).svg" alt="Ícone Gráfico" class="image_icon" >
            <span>Gráfico</span>
        </a>
    </div>
</div>

<br><br><br><br>
<!-- Conteúdo principal da página -->
<div class="container">
    <div id="header2">
        <h1>CRUD-Delfis!</h1> <!-- Título principal da página -->
    </div>

    <div class="content">
        <div class="headers">
            <h2>Moedas</h2> <!-- Título da seção de moedas -->
            <!-- Formulário para adicionar novas moedas -->
            <form action="pagina_aumentae_moedas">
                <button class="add-user-btn" type="submit">Adicionar Moedas</button>
            </form>
        </div>

        <!-- Tabela para exibir as moedas -->
        <div class="table">
            <div class="table-header">
                <!-- Cabeçalho da tabela com os nomes das colunas -->
                <div class="column">ID</div>
                <div class="column">Nome</div>
                <div class="column">Total_moedas</div>
                <div class="column"></div> <!-- Coluna vazia para ações (editar/excluir) -->
            </div>

            <!-- Iteração sobre a lista de moedas -->
            <%
                List<Usuario_Moedas> moedas = (List<Usuario_Moedas>) request.getAttribute("listaMoedas"); // Obtém a lista de moedas da requisição
                if (moedas != null && !moedas.isEmpty()) { // Verifica se a lista não está vazia
                    // Itera sobre cada item na lista de moedas
                    for (Usuario_Moedas coin : moedas) {
            %>
            <!-- Inclusão de um arquivo JSP para mostrar as informações da moeda -->
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
            <!-- Mensagem caso a lista de moedas esteja vazia -->
            <div>Nenhuma moeda encontrada.</div>
            <%
                }
            %>
        </div>
    </div>
</div>

<!-- Inclusão do script JavaScript -->
<script src="java_script/script.js"></script>
</body>
</html>
<!-- Fim do código HTML -->
