package org.example.teste.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.Listar.Listar;

import java.io.*;
@WebServlet(name="pagina_update_poder",value = "/update_poder")
public class Pagina_update_poder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Define o tipo de conteúdo da resposta como HTML
        int idPowerup = Integer.parseInt(req.getParameter("id_powerup"));

        Listar mostra = new Listar();
        req.setAttribute("poderes", mostra.listarPoderPorId(idPowerup));
        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Update_JSP/pagina_update_poderes.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim




