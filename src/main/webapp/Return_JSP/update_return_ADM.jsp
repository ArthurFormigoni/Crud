<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Início do código HTML -->
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <!-- Definindo a codificação de caracteres para UTF-8 e a configuração de visualização para dispositivos móveis -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Título da página -->
    <title>Tela de retorno</title>

    <!-- Link para o arquivo de estilo CSS que irá estilizar a página -->
    <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container principal da página -->
<div class="container">
    <!-- Caixa de mensagem que exibirá a confirmação -->
    <div class="message-box">
        <!-- Cabeçalho da mensagem, informando que a alteração foi realizada com sucesso -->
        <h1>Usuário Administrador Alterado com Sucesso!</h1>

        <!-- Texto explicativo sobre a alteração feita -->
        <p>As alterações no usuário administrador foram salvas com sucesso. Clique abaixo para retornar à página inicial.</p>

        <!-- Formulário com botão que redireciona para a página inicial -->
        <form action="home">
            <button class="button" type="submit">Voltar para a Página Inicial</button>
        </form>
    </div>
</div>
</body>
</html>
<!-- Fim do código HTML -->

