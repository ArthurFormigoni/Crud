//Importações  - Início

package org.example.teste.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.Listar.Listar;

import java.io.*;
//Importações - Fim


//Classe - Início
@WebServlet(name="pagina_update_adm",value = "/update_adm")
public class Pagina_update_adm extends HttpServlet {
    @Override
    // Métodos - Início.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Define o tipo de conteúdo da resposta como HTML
        int id = Integer.parseInt(req.getParameter("id_adm"));

        Listar mostra = new Listar();
        req.setAttribute("adms", mostra.listarAdmID(id));
        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/Update_JSP/pagina_update_ADM.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim
