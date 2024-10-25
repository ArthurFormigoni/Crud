<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="table-row">

    <div class="table-cell"><div class="image-container">
        <img src="<%= request.getParameter("imagem_url") %>" alt="123" class="imagem-redonda">
    </div></div>
    <div class="table-cell"><%= request.getParameter("id_adm") %></div>
    <div class="table-cell"><%= request.getParameter("login") %></div>
    <div class="table-cell"><%= request.getParameter("nome") %></div>
    <div class="table-cell"><%= request.getParameter("email") %></div>
    <div class="table-cell"><%= request.getParameter("senha") %></div>
    <div class="table-cell"><%= request.getParameter("dt_nasc") %></div>
    <div class="table-cell"><%= request.getParameter("dt_criacao") %></div>

    <div class="table-cell actions">
        <form action="update_adm">
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>">
            <button type="submit"><img src="Imagens/pen%201.svg" alt="Edit"></button>
        </form>
        <form action="deletar_adm" method="post">
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>">
            <button type="submit"><a href="#"><img src="Imagens/trash%201.svg" alt="Delete"></a> </button>
        </form>
    </div>
</div>
