package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.PowerupDAO;

import java.io.IOException;

@WebServlet (name = "adicionar", value = "/adicionarPoder")

public class AdicionarPoder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("name");
        int quantidade = Integer.parseInt(req.getParameter("qtd"));
        int preco = Integer.parseInt(req.getParameter("preco"));
        int duracao = Integer.parseInt(req.getParameter("duracao"));
        resp.setContentType("text/html");

        PowerupDAO pdao = new PowerupDAO();

        pdao.adicionar_poder(nome, quantidade, preco, duracao);
        req.getRequestDispatcher("Return_JSP/adicionar_poder_return.jsp").forward(req, resp);

    }
}
