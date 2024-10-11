<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="table-row">
    <div class="table-cell"><%= request.getParameter("id_adm") %></div>
    <div class="table-cell"><%= request.getParameter("login") %></div>
    <div class="table-cell"><%= request.getParameter("nome") %></div>
    <div class="table-cell"><%= request.getParameter("email") %></div>
    <div class="table-cell"><%= request.getParameter("senha") %></div>
    <div class="table-cell"><%= request.getParameter("dt_nasc") %></div>
    <div class="table-cell"><%= request.getParameter("dt_criacao") %></div>
    <div class="table-cell"><%= request.getParameter("imagem_url") %></div>
    <div class="table-cell actions">
        <a href="#"><img src="pen 1.svg" alt="Edit"></a>
        <form action="deletar_adm" method="post">
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>">
            <button type="submit"><a href="#"><img src="trash 1.svg" alt="Delete"></a> </button>
        </form>
    </div>
</div>
