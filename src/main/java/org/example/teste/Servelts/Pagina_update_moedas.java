package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
@WebServlet(name="pagina_update_moedas",value = "/update_moedas")
public class Pagina_update_moedas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Define o tipo de conteúdo da resposta como HTML
        int idMoedas = Integer.parseInt(req.getParameter("id_moedas"));

        Listar mostra = new Listar();
        req.setAttribute("moedas", mostra.listarMoedasId(idMoedas));
        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/HTML/pagina_update_coins.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim


