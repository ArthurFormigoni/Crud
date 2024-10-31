package org.example.teste.Servelts;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;
import org.example.teste.DAO.MoedasDAO;
import org.example.teste.Model.Moedas;

import java.io.*;
@WebServlet(name="mudarMoedas", value = "/mudarMoedas")
public class UpdateMoedas extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // Verifica se 'quantidade' está nulo ou vazio
        String quantidadeStr = req.getParameter("quantidade");
        String idMoedasStr = req.getParameter("id_moedas");
        String idUsuarioStr = req.getParameter("usuario_id");


            try {
                // Tenta converter quantidadeStr para um inteiro
                int quantidade = Integer.parseInt(quantidadeStr);

                // Verifica outros parâmetros

                if (idMoedasStr == null || idUsuarioStr == null) {
                    resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Parâmetros 'id_moedas' ou 'fk_usuario' ausentes.");
                    return;
                }

                int id_moedas = Integer.parseInt(idMoedasStr);
                int id_usuario = Integer.parseInt(idUsuarioStr);

                MoedasDAO coins2 = new MoedasDAO();
                coins2.substituirMoedas(quantidade, id_moedas, id_usuario);
            } catch (NumberFormatException e) {
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Quantidade inválida");
                return;
            }

        // Define o tipo de conteúdo da resposta como HTML
        resp.setContentType("text/html");

        // Encaminha a requisição e a resposta para a página de retorno
        req.getRequestDispatcher("/Return_JSP/update_return.jsp").forward(req, resp);
    }
}
//Métodos e Classe - Fim


