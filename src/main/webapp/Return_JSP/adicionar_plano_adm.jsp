
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Define o conjunto de caracteres para UTF-8 e ajusta o layout para dispositivos móveis -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Define o título da página -->
    <title>Tela de retorno</title>

    <!-- Link para o arquivo CSS personalizado -->
    <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container principal que envolve a mensagem de retorno -->
<div class="container">
    <!-- Caixa de mensagem de sucesso para o usuário -->
    <div class="message-box">
        <!-- Título indicando que o Premium foi adicionado com sucesso -->
        <h1>Premium Adicionado com Sucesso!</h1>

        <!-- Mensagem adicional de confirmação -->
        <p>Parabéns! Seu cadastro foi concluído com sucesso. Clique abaixo para retornar à página inicial.</p>

        <!-- Formulário com botão para redirecionar à página inicial -->
        <form action="home">
            <button class="button" type="submit">Voltar para a Página Inicial</button>
        </form>
    </div>
</div>
</body>
</html>

