<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="table-row">
    <div class="table-cell"><%= request.getParameter("id") %></div>
    <div class="table-cell"><%= request.getParameter("id_ranking") %></div>
    <div class="table-cell"><%= request.getParameter("id_plano") %></div>
    <div class="table-cell"><%= request.getParameter("nome") %></div>
    <div class="table-cell"><%= request.getParameter("email") %></div>
    <div class="table-cell"><%= request.getParameter("senha") %></div>
    <div class="table-cell"><%= request.getParameter("data_nascimento") %></div>
    <div class="table-cell"><%= request.getParameter("level") %></div>
    <div class="table-cell"><%= request.getParameter("pontos") %></div>
    <div class="table-cell"><%= request.getParameter("data_criacao") %></div>
    <div class="table-cell actions">
        <a href="#"><img src="Imagens/pen%201.svg" alt="Edit"></a>

        <a href="#"><img src="Imagens/trash%201.svg" alt="Delete"></a>
        <form action="deletar_premuim" method="post">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
            <input type="submit" value="Remover Premuim">
        </form>
    </div>
</div>
