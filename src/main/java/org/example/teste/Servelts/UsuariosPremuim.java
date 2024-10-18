package org.example.teste.Servelts;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "usuartios_premuim", value = "/usuarios_premuim")
public class UsuariosPremuim extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Listar mostra = new Listar();



        // A lista de usuários é adicionada ao request
        request.setAttribute("listaUsuarios", mostra.listarUsuarioPremuim());

        response.setContentType("text/html");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Retunr_JSP/crud_return.jsp").forward(request, response);

    }

}
