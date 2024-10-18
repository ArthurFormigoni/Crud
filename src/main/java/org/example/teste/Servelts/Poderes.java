package org.example.teste.Servelts;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



@WebServlet(name = "poderes", value = "/poderes")
public class Poderes extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Listar mostra = new Listar();

        // A lista de usuários é adicionada ao request
        request.setAttribute("listaPoderes", mostra.listarPoderes());

        response.setContentType("text/html");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Retunr_JSP/crud_return_poderes.jsp").forward(request, response);

    }

}
