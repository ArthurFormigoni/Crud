<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Powerup" %>

<!-- Início do código HTML -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!-- Definindo a codificação de caracteres para UTF-8 e a configuração de visualização em dispositivos móveis -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>CRUD - Lista de Poderes</title>

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
            <h2>Poderes</h2> <!-- Título da seção de poderes -->
            <!-- Formulário para adicionar novos poderes -->
            <form action="poderes_page">
                <button class="add-user-btn">Adicionar poderes</button>
            </form>
        </div>

        <!-- Tabela para exibir os poderes -->
        <div class="table">
            <div class="table-header">
                <!-- Cabeçalho da tabela com os nomes das colunas -->
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

            <!-- Iteração sobre a lista de poderes -->
            <%
                List<Powerup> poderes = (List<Powerup>) request.getAttribute("listaPoderes"); // Obtém a lista de poderes da requisição
                if (poderes != null && !poderes.isEmpty()) { // Verifica se a lista não está vazia
                    // Itera sobre cada item na lista de poderes
                    for (Powerup pwe : poderes) {
            %>
            <!-- Inclusão de um arquivo JSP para mostrar as informações do poder -->
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
            <!-- Mensagem caso a lista de poderes esteja vazia -->
            <div>Nenhum poder encontrado.</div>
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

