//Importações  - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;
import org.example.teste.DAO.PowerupDAO;

import java.io.*;
//Importações - Fim


//Classe - Início
@WebServlet(name="mudarPoder",value = "/mudarPoder")
public class UpdatePoder extends HttpServlet {
    @Override
    // Métodos - Início.
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome =req.getParameter("nome");
        int quantidade = Integer.parseInt(req.getParameter("quantidade"));
        double preco = Double.parseDouble(req.getParameter("preco"));
        int id = Integer.parseInt(req.getParameter("id_powerup"));

        PowerupDAO pdao = new PowerupDAO();
        pdao.updatePoder(id,nome,quantidade,preco);
        // Define o tipo de conteúdo da resposta como HTML

        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim
