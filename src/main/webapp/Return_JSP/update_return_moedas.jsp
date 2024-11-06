<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Início do código HTML -->
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Definir a codificação de caracteres para UTF-8 e ajustar a visualização em dispositivos móveis -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>Tela de retorno</title>

    <!-- Link para o arquivo de estilo CSS -->
    <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container principal da página -->
<div class="container">
    <!-- Caixa de mensagem de sucesso -->
    <div class="message-box">
        <!-- Título da mensagem -->
        <h1>Moedas Alteradas com Sucesso!</h1>

        <!-- Texto explicativo sobre a alteração feita -->
        <p>As alterações nas moedas foram salvas com sucesso. Clique abaixo para retornar à página inicial.</p>

        <!-- Botão para voltar à página inicial -->
        <form action="home">
            <button class="button" type="submit">Voltar para a Página Inicial</button>
        </form>
    </div>
</div>
</body>
</html>
<!-- Fim do código HTML -->
