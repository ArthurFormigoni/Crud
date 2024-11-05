<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo e a linguagem da página -->

<div class="table-row"><!-- Início de uma nova linha da tabela -->

    <div class="table-cell"><%= request.getParameter("id_usuario") %></div> <!-- Célula para exibir o ID do usuário -->
    <div class="table-cell"><%= request.getParameter("nome") %></div> <!-- Célula para exibir o nome do usuário -->
    <div class="table-cell"><%= request.getParameter("total_moedas") %></div> <!-- Célula para exibir o total de moedas do usuário -->

    <div class="table-cell actions"> <!-- Célula para as ações (editar) -->
        <form action="update_moedas"> <!-- Formulário para atualizar as moedas do usuário -->
            <input type="hidden" name="id_usuario" value="<%= request.getParameter("id_usuario") %>"> <!-- ID do usuário como parâmetro oculto -->
            <input type="hidden" name="id_moedas" value="<%= request.getParameter("id_moedas") %>"> <!-- ID das moedas como parâmetro oculto -->
            <button type="submit"><img src="Imagens/pen%201.svg" alt="Editar"></button> <!-- Botão para submeter o formulário de edição -->
        </form>
    </div>

</div>
