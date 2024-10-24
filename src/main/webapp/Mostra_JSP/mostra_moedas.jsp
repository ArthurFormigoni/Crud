<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="table-row">

    <div class="table-cell"><%= request.getParameter("id_usuario") %></div>
    <div class="table-cell"><%= request.getParameter("nome") %></div>
    <div class="table-cell"><%= request.getParameter("total_moedas") %></div>




    <div class="table-cell actions">
        <a href="#"><img src="Imagens/pen%201.svg" alt="Edit"></a>
        <form  >
            <input type="hidden" name="id_adm" value="<%= request.getParameter("id_adm") %>">
            <button type="submit"><a href="#"><img src="Imagens/trash%201.svg" alt="Delete"></a> </button>
        </form>
    </div>
</div>
