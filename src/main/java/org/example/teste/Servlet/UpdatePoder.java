//Importações  - Início

package org.example.teste.Servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.PowerupDAO;

import java.io.IOException;

@WebServlet(name = "mudarPoder", value = "/mudarPoder")
public class UpdatePoder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Recuperando os parâmetros da requisição
        String nome = req.getParameter("nome");
        String quantidadeStr = req.getParameter("quantidade");
        String precoStr = req.getParameter("preco");
        String idStr = req.getParameter("id_powerup");

        // Verificando se os parâmetros essenciais não são nulos
        if (nome == null || quantidadeStr == null || precoStr == null || idStr == null) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Todos os parâmetros são necessários.");
            return;
        }

        try {
            // Convertendo os parâmetros
            int quantidade = Integer.parseInt(quantidadeStr);
            double preco = Double.parseDouble(precoStr);
            int id = Integer.parseInt(idStr);

            // Chama o DAO para realizar a atualização
            PowerupDAO pdao = new PowerupDAO();
            boolean sucesso = pdao.updatePoder(id, nome, quantidade, preco);

            // Se a atualização for bem-sucedida
            if (sucesso) {
                // Enviar o usuário para a página de sucesso
                req.getRequestDispatcher("Return_JSP/update_return_poderes.jsp").forward(req, resp);
            } else {
                // Se não houver alteração, ou se o id não foi encontrado
                resp.sendError(HttpServletResponse.SC_NOT_MODIFIED, "Nenhuma alteração foi realizada.");
            }

        } catch (NumberFormatException e) {
            // Caso a conversão falhe
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Dados inválidos: " + e.getMessage());
        }
    }
}
