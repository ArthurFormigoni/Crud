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
        <a href="#"><img src="pen 1.svg" alt="Edit"></a>
        <a href="#"><img src="trash 1.svg" alt="Delete"></a>
    </div>
</div>
