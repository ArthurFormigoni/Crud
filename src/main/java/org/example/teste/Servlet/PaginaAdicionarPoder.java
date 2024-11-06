//Importações  - Início

package org.example.teste.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//Importações - Fim


@WebServlet(name = "paginaPoderes", value = "/poderes_page")

public class PaginaAdicionarPoder extends HttpServlet {

    // Métodos - Início

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("Adicionar_JSP/adicionar_poder.jsp").forward(request, response);

    }
}//Métodos e Classe - Fim