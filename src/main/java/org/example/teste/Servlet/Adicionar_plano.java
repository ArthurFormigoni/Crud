//Importações  - Início

package org.example.teste.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.UsuariosPremiumDAO;

import java.io.*;
//Importações - Fim


//Classe - Início
@WebServlet(name="adicionar_plano",value = "/adicionar_plano")
public class Adicionar_plano extends HttpServlet {
    @Override
    // Métodos - Início.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuariosPremiumDAO usuariosPremiumDAO = new UsuariosPremiumDAO();
        int id = Integer.parseInt(req.getParameter("id_usuario"));
        usuariosPremiumDAO.addPremiumUser(id);
        resp.setContentType("text/html");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Return_JSP/adicionar_plano_adm.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim
