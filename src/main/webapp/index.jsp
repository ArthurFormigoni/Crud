<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal Delfis!</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<div class="main">
    <input type="checkbox" id="chk" aria-hidden="true">

    <div class="signup">
        <form action="login" method="post">
            <label for="chk" aria-hidden="true">Portal Delfis!</label>
            <input type="text" name="txt" placeholder="User name" required>
            <input type="password" name="pswd" placeholder="Password" required>
            <% int teste=0;
                if (request.getAttribute("teste") != null){
                teste = (int) request.getAttribute("teste");
            }
                if (teste==1){
            %>
            <p id="incorreto">Senha ou usuario incorreto</p>
            <%}

            %>
            <button>Entrar</button>
        </form>
    </div>
    <div class="login">
        <form>
            <label for="chk" aria-hidden="true">Login</label>
            <input type="email" name="email" placeholder="Email" required="">
            <input type="password" name="pswd" placeholder="Password" required="">
            <button>Login</button>
        </form>
    </div>




</div>
</body>
</html>