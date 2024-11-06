package org.example.teste.Servlet;

// Importações necessárias para a configuração do Servlet
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.PowerupDAO;

import java.io.IOException;

// Definição do Servlet, configurado para responder a solicitações na URL /adicionarPoder
@WebServlet(name = "adicionar", value = "/adicionarPoder")
public class AdicionarPoder extends HttpServlet {

    // Método que responde às requisições GET
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Obtém os parâmetros 'name', 'quantidade' e 'preco' passados pela requisição

        String nome = req.getParameter("name");
        int quantidade = Integer.parseInt(req.getParameter("qtd"));
        int preco = Integer.parseInt(req.getParameter("preco"));


        // Define o tipo de conteúdo da resposta como HTML
        resp.setContentType("text/html");

        // Cria uma instância de PowerupDAO para acesso ao banco de dados
        PowerupDAO pdao = new PowerupDAO();

        // Adiciona um novo poder ao banco de dados usando o DAO
        pdao.adicionar_poder(nome, quantidade ,preco);

        // Redireciona para a página de confirmação após a adição
        req.getRequestDispatcher("Return_JSP/adicionar_poder_return.jsp").forward(req, resp);
    }
}
