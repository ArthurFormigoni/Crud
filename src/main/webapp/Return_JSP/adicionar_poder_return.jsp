<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Define o charset como UTF-8 e ajusta o layout para diferentes tamanhos de tela -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>Tela de retorno</title>

    <!-- Link para o arquivo CSS que estiliza a página -->
    <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container principal que centraliza o conteúdo da mensagem -->
<div class="container">
    <!-- Caixa de mensagem de sucesso -->
    <div class="message-box">
        <!-- Mensagem de confirmação de sucesso -->
        <h1>Poder Adicionado com Sucesso!</h1>

        <!-- Descrição adicional da ação realizada -->
        <p>O poder foi adicionado ao perfil com sucesso. Clique abaixo para retornar à página inicial.</p>

        <!-- Botão de retorno à página inicial -->
        <form action="home">
            <button class="button" type="submit">Voltar para a Página Inicial</button>
        </form>
    </div>
</div>
</body>
</html>
