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
@WebServlet(name="mudarUser",value = "/mudarUser")
public class UpadateUser extends HttpServlet {
    @Override
    // Métodos - Início.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("name");
        String senha = req.getParameter("password");
        int pontos = Integer.parseInt(req.getParameter("pontos"));
        String dt_nasc = req.getParameter("dt_nasc");
        String email = req.getParameter("email");
        int id = Integer.parseInt(req.getParameter("id_user"));

        UsuariosPremiumDAO userpr = new UsuariosPremiumDAO();
        userpr.updateUserPremium(nome,senha,pontos,dt_nasc,email,id);


        // Define o tipo de conteúdo da resposta como HTML

        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Return_JSP/update_return_usuario.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim
