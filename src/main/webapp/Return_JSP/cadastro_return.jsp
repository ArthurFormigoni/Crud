<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <!-- Define a codificação de caracteres como UTF-8 e ajusta o layout para diferentes dispositivos -->
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- Título da página -->
  <title>Tela de retorno</title>

  <!-- Link para o arquivo CSS para estilizar a página -->
  <link rel="stylesheet" href="CSS/styleCadastro.css">
</head>
<body>
<!-- Container que envolve todo o conteúdo da página -->
<div class="container">
  <!-- Caixa de mensagem exibindo o sucesso -->
  <div class="message-box">
    <!-- Título da mensagem de sucesso -->
    <h1>Usuário Administrador Cadastrado com Sucesso!</h1> <!-- Mensagem de sucesso -->

    <!-- Texto explicativo detalhando a ação realizada -->
    <p>O novo usuário administrador foi cadastrado com sucesso. Clique abaixo para retornar à página inicial.</p>

    <!-- Formulário com botão para retornar à página inicial -->
    <form action="home">
      <button class="button" type="submit">Voltar para a Página Inicial</button>
    </form>
  </div>
</div>
</body>
</html>
