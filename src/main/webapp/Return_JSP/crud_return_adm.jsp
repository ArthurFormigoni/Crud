<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.Adm" %>

<!-- Início do código HTML -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!-- Define a codificação de caracteres e a visualização para diferentes dispositivos -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>CRUD - Lista de Administradores</title>

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

        <form action="usuarios_premuim" method="get" class="menu-item">
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
            <h2>Administradores</h2> <!-- Título para a seção de administradores -->
            <!-- Formulário para adicionar um administrador -->
            <form action="pagina_adm">
                <button class="add-user-btn" type="submit">Adicionar Administrador</button>
            </form>
        </div>

        <!-- Tabela para exibir os administradores -->
        <div class="table">
            <div class="table-header">
                <!-- Cabeçalho da tabela com os nomes das colunas -->
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

            <!-- Iteração sobre a lista de administradores -->
            <%
                List<Adm> administradores = (List<Adm>) request.getAttribute("listaADM"); // Obtém a lista de administradores da requisição
                if (administradores != null && !administradores.isEmpty()) { // Verifica se a lista não está vazia
                    // Itera sobre cada administrador na lista
                    for (Adm adm : administradores) {
            %>
            <!-- Inclusão de um arquivo JSP para mostrar as informações do administrador -->
            <jsp:include page="/Mostra_JSP/mostra_adm.jsp">
                <!-- Passagem de parâmetros para o arquivo incluído -->
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
            <!-- Mensagem caso não haja administradores -->
            <div>Nenhum administrador encontrado.</div>
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
