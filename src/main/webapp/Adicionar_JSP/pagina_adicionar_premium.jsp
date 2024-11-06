
<%@ page import="java.util.List" %> <!-- Importa a classe List para manipulação de listas -->
<%@ page import="org.example.teste.Model.UsuariosPremium" %> <!-- Importa a classe UsuariosPremium do pacote org.example.teste.Model -->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura a página para ser responsiva -->
    <title>Portal</title> <!-- Título da página -->
    <link rel="stylesheet" href="CSS/styleUser.css"> <!-- Importa o arquivo CSS para estilizar a página -->
</head>
<body>
<div class="main"> <!-- Container principal -->

    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto, possivelmente usado para alternar a exibição -->

    <div class="signup"> <!-- Seção do formulário de assinatura -->

        <div class="menu-container"> <!-- Container do menu para adicionar usuários premium -->
            <p>Adicionar Premium</p> <!-- Título da seção -->
            <button class="menu-button">Selecione um usuário</button> <!-- Botão do menu para seleção de usuários -->

            <div class="menu-list"> <!-- Lista de opções do menu -->
                <%
                    // Obtém a lista de usuários premium passada pela requisição
                    List<UsuariosPremium> usuarios = (List<UsuariosPremium>) request.getAttribute("listaUsuarios");

                    // Verifica se a lista não está vazia
                    if (usuarios != null && !usuarios.isEmpty()) {
                        // Loop para exibir cada usuário da lista
                        for (UsuariosPremium usuario : usuarios) {
                %>
                <form action="adicionar_plano"> <!-- Formulário para adicionar o plano premium ao usuário -->
                    <input type="hidden" name="id_usuario" value="<%= usuario.getId_usuario() %>"> <!-- Campo oculto com o ID do usuário -->
                    <button><a><%= usuario.getNome() %></a></button> <!-- Botão com o nome do usuário -->
                </form>
                <%
                    }
                } else {
                %>
                <a>Nenhum usuário encontrado.</a> <!-- Mensagem caso não haja usuários disponíveis -->
                <%
                    }
                %>
            </div>
        </div>

    </div>

    <%
        int teste = 0; // Variável para verificação de erro

        // Verifica se existe o atributo "verificar" na requisição
        if (request.getAttribute("verificar") != null) {
            teste = (int) request.getAttribute("verificar");
        }

        // Se 'teste' for igual a 1, exibe uma mensagem de erro
        if (teste == 1) {
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <!-- Mensagem de erro exibida caso os dados estejam incorretos -->
    <% } %>

</div>
</body>
</html>

