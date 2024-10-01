
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD - User List</title>
    <link rel="stylesheet" href="style2.css">
</head>

<body>
<div class="container">
    <header>
        <h1>CRUD</h1>
    </header>

    <div class="content">
        <div class="header">
            <h2>Users</h2>
            <button class="add-user-btn">ADD USER</button>
        </div>

        <div class="table">
            <div class="table-header">
                <div class="column">id</div>
                <div class="column">id_Ranking</div>
                <div class="column">id_Plano</div>
                <div class="column">Nome</div>
                <div class="column">Email</div>
                <div class="column">Senha</div>
                <div class="column">Data de Nascimento</div>
                <div class="column">Level</div>
                <div class="column">Pontos</div>
                <div class="column">Data de criação</div>

                <div class="column"></div> <!-- Empty column for actions (edit/delete) -->
            </div>


            <!-- Repeat this block for each user -->

            <!-- End repeat -->
        </div>

    </div>
</div>
</body>

</html>
