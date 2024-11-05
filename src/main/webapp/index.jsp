<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!-- Define o tipo de conteúdo como HTML com codificação UTF-8 -->
<!DOCTYPE html> <!-- Informa que o documento é um HTML5 -->
<html> <!-- Início do documento HTML -->
<head>
    <meta charset="UTF-8"> <!-- Define a codificação de caracteres como UTF-8 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Configura o viewport para dispositivos móveis -->
    <title>Portal Delfis!</title> <!-- Título da página -->
    <link rel="stylesheet" href="CSS/style.css"> <!-- Link para a folha de estilo CSS -->
</head>
<body>
<div class="main"> <!-- Início da seção principal -->
    <input type="checkbox" id="chk" aria-hidden="true"> <!-- Checkbox oculto para controle de interação -->

    <div class="signup"> <!-- Seção do formulário de cadastro -->
        <form action="login" method="post"> <!-- Formulário que envia dados para a ação 'login' via POST -->
            <label for="chk" aria-hidden="true">Portal Delfis!</label> <!-- Rótulo oculto para o formulário -->

            <input type="text" name="txt" placeholder="User name" required> <!-- Campo para o nome de usuário -->
            <input type="password" name="pswd" placeholder="Password" required> <!-- Campo para a senha -->

            <%
                int teste = 0; // Inicializa variável para controle de erro
                // Verifica se existe um atributo 'teste' na requisição
                if (request.getAttribute("teste") != null) {
                    teste = (int) request.getAttribute("teste"); // Converte o atributo para inteiro
                }
                // Se 'teste' for igual a 1, exibe mensagem de erro
                if (teste == 1) {
            %>
            <p id="incorreto">Senha ou usuario incorreto</p> <!-- Mensagem de erro para credenciais inválidas -->
            <% } %> <!-- Fim do bloco de verificação de erro -->

            <button>Entrar</button> <!-- Botão para enviar o formulário -->
        </form>
    </div>

    <div class="login"> <!-- Seção do formulário de login -->
        <form> <!-- Formulário que não tem ação definida -->
            <label for="chk" aria-hidden="true">Login</label> <!-- Rótulo oculto para o formulário -->

            <input type="email" name="email" placeholder="Email" required=""> <!-- Campo para email -->
            <input type="password" name="pswd" placeholder="Password" required=""> <!-- Campo para senha -->

            <button>Login</button> <!-- Botão para enviar o formulário -->
        </form>
    </div>

</div>
</body>
</html>
