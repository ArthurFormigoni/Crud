package org.example.teste.Servelts;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "pagina_adm", value = "/pagina_adm")

public class Pagina_cadastro_adm extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("HTML/pagina_cadastroADM.jsp").forward(request, response);

    }
}