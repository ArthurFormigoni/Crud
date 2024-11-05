<%--
  Informações do autor e data de criação do arquivo (geradas automaticamente pelo IntelliJ IDEA)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%-- Define o tipo de conteúdo da página como HTML e o idioma como Java --%>
<html>
<head>
    <meta charset="UTF-8"> <%-- Define a codificação de caracteres como UTF-8 --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <%-- Torna a página responsiva em diferentes dispositivos --%>
    <title>Adicionar Poder</title> <%-- Define o título da página --%>
    <link rel="stylesheet" href="CSS/moedas.css"> <%-- Link para o arquivo de estilo CSS externo --%>
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true"> <%-- Checkbox oculto, possivelmente usado para alternar o formulário --%>

    <div class="signup">
        <form action="adicionarPoder" > <%-- Formulário com ação para adicionar um poder --%>
            <label for="chk" aria-hidden="true"></label> <%-- Rótulo do formulário --%>
            <h1>DELFIS!</h1>
            <p>Nome</p>
            <input type="text" name="name" placeholder="Name" required> <%-- Campo de texto para o nome, obrigatório --%>
            <p>Quantidade</p>
            <input type="text" name="qtd" placeholder="Quantidade" required> <%-- Campo de texto para a quantidade, obrigatório --%>
            <p>Preço</p>
            <input type="text" name="preco" placeholder="Preco" required> <%-- Campo numérico para o preço, obrigatório --%>
            <button class="sla">Adicionar</button> <%-- Botão para enviar o formulário --%>
        </form>
    </div>

        <%
        // Inicializa a variável 'teste' com valor 0
        int teste=0;

        // Verifica se existe um atributo "verificar" na requisição
        if (request.getAttribute("verificar") != null){
            // Define 'teste' com o valor do atributo "verificar"
            teste = (int) request.getAttribute("verificar");
        }

        // Se 'teste' for igual a 1, exibe uma mensagem de erro
        if (teste == 1){
    %>
    <p id="incorreto">Dados inseridos incorretamente</p> <%-- Mensagem de erro exibida caso os dados estejam incorretos --%>
        <%} %>

</body>
</html>
