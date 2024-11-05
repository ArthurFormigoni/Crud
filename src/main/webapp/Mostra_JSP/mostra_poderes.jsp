<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo e a linguagem da página -->

<div class="table-row"> <!-- Início de uma nova linha da tabela -->

    <div class="table-cell"> <!-- Célula para a imagem do power-up -->
        <div class="image-container">
            <img src="<%= request.getParameter("imagem_loja_url") %>" alt="Imagem do Power-up" class="imagem-redonda"> <!-- Exibe a imagem do power-up -->
        </div>
    </div>

    <div class="table-cell"><%= request.getParameter("nome") %></div> <!-- Célula para o nome do power-up -->
    <div class="table-cell"><%= request.getParameter("quantidade") %></div> <!-- Célula para a quantidade disponível -->
    <div class="table-cell"><%= request.getParameter("id_powerup") %></div> <!-- Célula para o ID do power-up -->
    <div class="table-cell"><%= request.getParameter("preco_moedas") %></div> <!-- Célula para o preço em moedas -->
    <div class="table-cell"><%= request.getParameter("initial_time") %></div> <!-- Célula para o tempo inicial -->
    <div class="table-cell"><%= request.getParameter("duracao") %></div> <!-- Célula para a duração do efeito -->
    <div class="table-cell"><%= request.getParameter("final_time") %></div> <!-- Célula para o tempo final -->

    <div class="table-cell actions"> <!-- Célula para ações (editar e deletar) -->
        <!-- Link para editar (sem ação definida, apenas um ícone) -->
        <a href="#"><img src="Imagens/pen%201.svg" alt="Editar"></a>

        <!-- Formulário para deletar um power-up -->
        <form action="deletar_poder" method="post">
            <input type="hidden" name="id_powerup" value="<%= request.getParameter("id_powerup") %>"> <!-- ID do power-up passado como parâmetro oculto -->
            <button type="submit"><img src="Imagens/trash%201.svg" alt="Deletar"></button> <!-- Botão para deletar -->
        </form>

        <!-- Formulário para atualizar um power-up -->
        <form action="update_poder">
            <input type="hidden" name="id_powerup" value="<%= request.getParameter("id_powerup") %>"> <!-- ID do power-up passado como parâmetro oculto -->
            <button type="submit"><img src="Imagens/pen%201.svg" alt="Editar"></button> <!-- Botão para editar -->
        </form>
    </div>
</div>
