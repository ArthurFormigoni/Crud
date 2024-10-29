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
@WebServlet(name="adicionar_premuim",value = "/adicionar_premuim")
public class Adicionar_premuim extends HttpServlet {
    @Override
    // Métodos - Início.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Listar mostra = new Listar();



        // A lista de usuários é adicionada ao request
        req.setAttribute("listaUsuarios", mostra.listarUsuario());

        resp.setContentType("text/html");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // Encaminha a requisição e a resposta para a página "home_crud.html" localizada na pasta "HTML"
        req.getRequestDispatcher("/HTML/pagina_adicionar_premuim.jsp").forward(req, resp);
    }
}//Métodos e Classe - Fim