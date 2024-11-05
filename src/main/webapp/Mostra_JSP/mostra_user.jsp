<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo e a linguagem da página -->

<div class="table-row"> <!-- Início de uma nova linha na tabela -->
    <div class="table-cell"><%= request.getParameter("id") %></div> <!-- Célula para o ID do usuário -->
    <div class="table-cell"><%= request.getParameter("id_ranking") %></div> <!-- Célula para o ID do ranking -->
    <div class="table-cell"><%= request.getParameter("id_plano") %></div> <!-- Célula para o ID do plano -->
    <div class="table-cell"><%= request.getParameter("nome") %></div> <!-- Célula para o nome do usuário -->
    <div class="table-cell"><%= request.getParameter("email") %></div> <!-- Célula para o e-mail do usuário -->
    <div class="table-cell"><%= request.getParameter("senha") %></div> <!-- Célula para a senha do usuário -->
    <div class="table-cell"><%= request.getParameter("data_nascimento") %></div> <!-- Célula para a data de nascimento -->
    <div class="table-cell"><%= request.getParameter("level") %></div> <!-- Célula para o nível do usuário -->
    <div class="table-cell"><%= request.getParameter("pontos") %></div> <!-- Célula para os pontos acumulados -->
    <div class="table-cell"><%= request.getParameter("data_criacao") %></div> <!-- Célula para a data de criação da conta -->

    <div class="table-cell actions"> <!-- Célula para ações (editar e deletar) -->

        <!-- Formulário para atualizar o usuário -->
        <form action="update_user">
            <button> <!-- Botão para submeter o formulário de atualização -->
                <a><img src="Imagens/pen%201.svg" alt="Editar"></a> <!-- Ícone de edição -->
            </button>
            <input type="hidden" name="id_user" value="<%= request.getParameter("id") %>"> <!-- ID do usuário passado como parâmetro oculto -->
        </form>

        <!-- Formulário para deletar o usuário -->
        <form action="deletar_usuario_premuim" method="post">
            <input type="hidden" name="id_user" value="<%= request.getParameter("id") %>"> <!-- ID do usuário passado como parâmetro oculto -->
            <button type="submit"> <!-- Botão para submeter o formulário de deleção -->
                <a><img src="Imagens/trash%201.svg" alt="Deletar"></a> <!-- Ícone de deleção -->
            </button>
        </form>
    </div>
</div>
