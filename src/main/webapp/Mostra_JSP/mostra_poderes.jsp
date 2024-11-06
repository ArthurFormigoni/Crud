<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Estrutura de uma linha de uma tabela -->
<div class="table-row">

    <!-- Coluna para a imagem do item -->
    <div class="table-cell">
        <div class="image-container">
            <!-- Imagem redonda do item, o URL é recebido como parâmetro -->
            <img src="<%= request.getParameter("imagem_loja_url") %>" alt="123" class="imagem-redonda">
        </div>
    </div>

    <!-- Coluna para o nome do item, recebido como parâmetro -->
    <div class="table-cell"><%= request.getParameter("nome") %></div>

    <!-- Coluna para a quantidade do item, recebido como parâmetro -->
    <div class="table-cell"><%= request.getParameter("quantidade") %></div>

    <!-- Coluna para o ID do item, recebido como parâmetro -->
    <div class="table-cell"><%= request.getParameter("id_powerup") %></div>

    <!-- Coluna para o preço em moedas, recebido como parâmetro -->
    <div class="table-cell"><%= request.getParameter("preco_moedas") %></div>

    <!-- Coluna para o horário inicial, recebido como parâmetro -->
    <div class="table-cell"><%= request.getParameter("initial_time") %></div>

    <!-- Coluna para a duração, recebida como parâmetro -->
    <div class="table-cell"><%= request.getParameter("duracao") %></div>

    <!-- Coluna para o horário final, recebido como parâmetro -->
    <div class="table-cell"><%= request.getParameter("final_time") %></div>

    <!-- Coluna para ações (deletar e editar) -->
    <div class="table-cell actions">
        <!-- Formulário para deletar o item -->
        <form action="deletar_poder" method="post">
            <!-- ID do item passado como campo oculto -->
            <input type="hidden" name="id_powerup" value="<%= request.getParameter("id_powerup") %>">
            <!-- Botão de deletar com ícone de lixeira -->
            <button type="submit"><a href="#"><img src="Imagens/trash%201.svg" alt="Delete"></a> </button>
        </form>

        <!-- Formulário para atualizar o item -->
        <form action="update_poder">
            <!-- ID do item passado como campo oculto -->
            <input type="hidden" name="id_powerup" value="<%= request.getParameter("id_powerup") %>">
            <!-- Botão de editar com ícone de caneta -->
            <button type="submit"><img src="Imagens/pen%201.svg" alt="Edit"></button>
        </form>
    </div>
</div>
