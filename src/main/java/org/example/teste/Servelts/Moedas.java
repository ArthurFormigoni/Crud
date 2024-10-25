//Importações  - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
//Importações - Fim


//Classe - Início
@WebServlet(name="moedas",value = "/moedas")
public class Moedas extends HttpServlet {

    // Métodos - Início
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Listar moeda = new Listar();
        req.setAttribute("listaMoedas", moeda.listarMoedas());
        resp.setContentType("text/html");
        req.getRequestDispatcher("Return_JSP/crud_return_moedas.jsp").forward(req, resp);

    }
}//Métodos e Classe - Fim