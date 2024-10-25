//Importações  - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;

import java.io.*;
//Importações - Fim


//Classe - Início
@WebServlet(name="mudarAdm",value = "/mudarADM")
public class UpdateADM extends HttpServlet {
    @Override
    // Métodos - Início.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("Login");
        String senha = req.getParameter("password");
        String nome =req.getParameter("name");
        String dt_nasc = req.getParameter("dt_nasc");
        String email = req.getParameter("email");
        int id = Integer.parseInt(req.getParameter("id_adm"));

        AdmDAO adm2 = new AdmDAO();
        adm2.updateAdm(login,senha,nome,dt_nasc,email,id);
        // Define o tipo de conteúdo da resposta como HTML

        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Return_JSP/update_return.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim
