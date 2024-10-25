package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.Connection.Conexao;
import org.example.teste.Model.Adm_;
import org.example.teste.Model.Powerup;

import java.io.*;
        import java.sql.*;

@WebServlet(name="adm",value = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Define o tipo de conteúdo da resposta como HTML
        resp.setContentType("text/html");

        // Obtém um objeto PrintWriter para escrever a resposta diretamente ao cliente, se necessário
        PrintWriter out = resp.getWriter();

        try {
            // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
            req.getRequestDispatcher("/HTML/home_crud.html").forward(req, resp);
        } catch (Exception e) {
            // Tratamento de erro para caso a página não seja encontrada ou ocorra algum problema no encaminhamento
            e.printStackTrace();
            out.println("<h3>Erro ao carregar a página home_crud.</h3>");
        } finally {
            // Fecha o PrintWriter após o uso
            out.close();
        }
    }
}