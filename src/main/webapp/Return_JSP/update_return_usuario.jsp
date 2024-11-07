<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Início do código HTML -->
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Define a codificação de caracteres como UTF-8 e ajusta a visualização em dispositivos móveis -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Define o título da página -->
    <title>Tela de retorno</title>

    <!-- Link para o arquivo de estilo CSS para a aparência da página -->
    <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container principal da página -->
<div class="container">
    <!-- Caixa de mensagem de sucesso -->
    <div class="message-box">
        <!-- Título da mensagem -->
        <h1>Usuário Alterado com Sucesso!</h1>

        <!-- Texto explicativo sobre a alteração realizada -->
        <p>As alterações no usuário foram salvas com sucesso. Clique abaixo para retornar à página inicial.</p>

        <!-- Botão que retorna à página inicial -->
        <form action="home">
            <button class="button" type="submit">Voltar para a Página Inicial</button>
        </form>
    </div>
</div>
</body>
</html>
<!-- Fim do código HTML -->
