//Importações  - Início

package org.example.teste.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.teste.Listar.Listar;
//Importações - Fim


@WebServlet(name = "usuartios_premium", value = "/usuarios_premium")
public class UsuariosPremuim extends HttpServlet {

    // Métodos - Início
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Listar mostra = new Listar();



        // A lista de usuários é adicionada ao request
        request.setAttribute("listaUsuarios", mostra.listarUsuarioPremuim());

        response.setContentType("text/html");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Return_JSP/crud_return_user.jsp").forward(request, response);

    }

}//Métodos e Classe - Fim
