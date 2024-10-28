package org.example.teste.Servelts;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;
import org.example.teste.DAO.CoinsDAO;
import org.example.teste.Model.Moedas;

import java.io.*;
@WebServlet(name="mudarMoedas",value = "/mudarMoedas")
public class UpdateMoedas extends HttpServlet{
    @Override
    // Métodos - Início.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int quantidade = Integer.parseInt(req.getParameter("quantidade"));
        int id_moedas = Integer.parseInt(req.getParameter("id_moedas"));
        int fk_usuario = Integer.parseInt(req.getParameter("fk_usuario"));

        CoinsDAO coins2 = new CoinsDAO();
        coins2.substituirMoedas(quantidade,id_moedas,fk_usuario);

        // Define o tipo de conteúdo da resposta como HTML

        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Return_JSP/update_return.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim


