//Importações  - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;
import org.example.teste.DAO.UsuariosPremuimDAO;

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

        UsuariosPremuimDAO userpr = new UsuariosPremuimDAO();
        userpr.upadateUserPremuim(nome,senha,pontos,dt_nasc,email,id);


        // Define o tipo de conteúdo da resposta como HTML

        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Return_JSP/update_return_ADM.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim
