package org.example.teste.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//Importações - Fim


@WebServlet(name = "pagina_aumentar_moedas", value = "/pagina_aumentae_moedas")

public class Pagina_aumentar_moedas extends HttpServlet {

    // Métodos - Início

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("Adicionar_JSP/adicionar_moedas.jsp").forward(request, response);

    }
}//Métodos e Classe - Fim