<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="table-row">

    <div class="table-cell"><div class="image-container">
        <img src="<%= request.getParameter("imagem_loja_url") %>" alt="123" class="imagem-redonda">
    </div></div>
    <div class="table-cell"><%= request.getParameter("nome") %></div>
    <div class="table-cell"><%= request.getParameter("quantidade") %></div>
    <div class="table-cell"><%= request.getParameter("id_powerup") %></div>
    <div class="table-cell"><%= request.getParameter("preco_moedas") %></div>
    <div class="table-cell"><%= request.getParameter("initial_time") %></div>
    <div class="table-cell"><%= request.getParameter("duracao") %></div>
    <div class="table-cell"><%= request.getParameter("final_time") %></div>
    <div class="table-cell"><%= request.getParameter("fk_id_pagamento_coins") %></div>


    <div class="table-cell actions">
        <a href="#"><img src="Imagens/pen%201.svg" alt="Edit"></a>
        <form  >
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>">
            <button type="submit"><a href="#"><img src="Imagens/trash%201.svg" alt="Delete"></a> </button>
        </form>
    </div>
</div>
