//Importações  - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;

import java.io.IOException;
import java.io.PrintWriter;
//Importações - Fim


@WebServlet(name = "servlet-login", value = "/servlet")

public class Login_Servlet extends HttpServlet {

    // Métodos - Início

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("Login/index.jsp").forward(request, response);

    }
}//Métodos e Classe - Fim