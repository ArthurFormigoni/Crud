<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Define a codificação de caracteres como UTF-8 e ajusta o layout para diferentes dispositivos -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>Tela de retorno</title>

    <!-- Link para o arquivo CSS com o estilo da página -->
    <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container principal que organiza o conteúdo -->
<div class="container">
    <!-- Caixa de mensagem de sucesso -->
    <div class="message-box">
        <!-- Título da mensagem de sucesso -->
        <h1>Moedas Inseridas com Sucesso!</h1>

        <!-- Texto explicativo sobre o que foi realizado -->
        <p>As moedas foram adicionadas. Clique abaixo para retornar à página inicial.</p>

        <!-- Formulário com botão para redirecionar o usuário à página inicial -->
        <form action="home">
            <button class="button" type="submit">Voltar para a Página Inicial</button>
        </form>
    </div>
</div>
</body>
</html>
