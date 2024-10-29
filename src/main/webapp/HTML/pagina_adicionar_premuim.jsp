<%@ page import="org.example.teste.Model.Adm_" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.teste.Model.UsuariosPremium" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal</title>
    <link rel="stylesheet" href="CSS/styleUser.css">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">
    <div class="signup">
            <div class="menu-container">
                <p>Adicionar Premuim</p>
                <button class="menu-button">Selecione um usuario</button>
                <div class="menu-list">
                    <%
                        List<UsuariosPremium> usuarios = (List<UsuariosPremium>) request.getAttribute("listaUsuarios");
                        if (usuarios != null && !usuarios.isEmpty()) {
                            for (UsuariosPremium usuario : usuarios) {
                    %>
                    <form action="adicionar_plano">
                        <input type="hidden" name="id_usuario" value="<%= usuario.getId_usuario() %>">
                        <button><a ><%= usuario.getNome() %></a></button>
                    </form>
                    <%
                        }
                    } else {
                    %>
                    <a>Nenhum usuário encontrado.</a>
                    <%
                        }
                    %>

                </div>
            </div>

    </div>
    <% int teste=0;
        if (request.getAttribute("verificar") != null){
            teste = (int) request.getAttribute("verificar");
        }
        if (teste==1){
    %>
    <p id="incorreto">Dados inseridos incorretamente</p>
    <%}

    %>

</div>
</body>
</html>