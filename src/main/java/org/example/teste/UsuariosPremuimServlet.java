package org.example.teste;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "usuartios_premuim", value = "/usuarios_premuim")
public class UsuariosPremuimServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("crud_return.jsp").forward(request, response);

    }


}