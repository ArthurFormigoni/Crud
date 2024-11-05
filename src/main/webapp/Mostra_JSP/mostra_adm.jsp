<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Configura o tipo de conteúdo e linguagem da página -->

<div class="table-row"> <!-- Início da linha da tabela -->

    <div class="table-cell"> <!-- Célula da tabela para a imagem -->
        <div class="image-container">
            <img src="<%= request.getParameter("imagem_url") %>" alt="Imagem do administrador" class="imagem-redonda"> <!-- Exibe a imagem do administrador -->
        </div>
    </div>

    <div class="table-cell"><%= request.getParameter("id_adm") %></div> <!-- Célula para o ID do administrador -->
    <div class="table-cell"><%= request.getParameter("login") %></div> <!-- Célula para o login do administrador -->
    <div class="table-cell"><%= request.getParameter("nome") %></div> <!-- Célula para o nome do administrador -->
    <div class="table-cell"><%= request.getParameter("email") %></div> <!-- Célula para o email do administrador -->
    <div class="table-cell"><%= request.getParameter("senha") %></div> <!-- Célula para a senha do administrador -->
    <div class="table-cell"><%= request.getParameter("dt_nasc") %></div> <!-- Célula para a data de nascimento do administrador -->
    <div class="table-cell"><%= request.getParameter("dt_criacao") %></div> <!-- Célula para a data de criação da conta -->

    <div class="table-cell actions"> <!-- Célula para ações (editar e deletar) -->
        <form action="update_adm"> <!-- Formulário para editar administrador -->
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>"> <!-- ID do administrador passado como parâmetro oculto -->
            <button type="submit"><img src="Imagens/pen%201.svg" alt="Editar"></button> <!-- Botão para editar -->
        </form>

        <form action="deletar_adm" method="post"> <!-- Formulário para deletar administrador -->
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>"> <!-- ID do administrador passado como parâmetro oculto -->
            <button type="submit"><img src="Imagens/trash%201.svg" alt="Deletar"></button> <!-- Botão para deletar -->
        </form>
    </div>
</div>
