package org.example.teste;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import  org.example.teste.Listar;

@WebServlet(name = "admServelet", value = "/adm")
public class AdmServelet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Listar mostra = new Listar();

        // A lista de administradores é adicionada ao request
        request.setAttribute("listaADM", mostra.listarAdm());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("crud_return_adm.jsp").forward(request, response);

    }
}
