package org.example.teste.Servelts;

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
        // Obtendo parâmetros
        String nome = req.getParameter("nome");
        String quantidadeStr = req.getParameter("quantidade");
        String precoStr = req.getParameter("preco");
        String idPowerupStr = req.getParameter("id_powerup");

        // Verificação de parâmetros
        if (nome == null || nome.trim().isEmpty()) {
            req.setAttribute("error", "Nome não pode ser vazio.");
            req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
            return;
        }

        if (quantidadeStr == null || quantidadeStr.trim().isEmpty()) {
            req.setAttribute("error", "Quantidade não pode ser vazia.");
            req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
            return;
        }

        if (precoStr == null || precoStr.trim().isEmpty()) {
            req.setAttribute("error", "Preço não pode ser vazio.");
            req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
            return;
        }

        if (idPowerupStr == null || idPowerupStr.trim().isEmpty()) {
            req.setAttribute("error", "ID do powerup não foi fornecido.");
            req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
            return;
        }

        try {
            // Convertendo os parâmetros para os tipos corretos
            int quantidade = Integer.parseInt(quantidadeStr);
            double preco = Double.parseDouble(precoStr);
            int id_powerup = Integer.parseInt(idPowerupStr);

            // Atualiza o poder no banco de dados
            PowerupDAO pdao = new PowerupDAO();
            boolean isUpdated = pdao.updatePoder(id_powerup, nome, quantidade, preco);

            // Verifica se a atualização foi bem-sucedida
            if (isUpdated) {
                req.setAttribute("msg", "Powerup atualizado com sucesso.");
            } else {
                req.setAttribute("error", "Não foi possível atualizar o powerup.");
            }

        } catch (NumberFormatException e) {
            req.setAttribute("error", "Quantidade ou preço inválidos.");
            req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
            return;
        } catch (Exception e) {
            req.setAttribute("error", "Ocorreu um erro inesperado: " + e.getMessage());
            req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
            return;
        }

        // Redireciona para a página de retorno
        req.getRequestDispatcher("Return_JSP/update_return.jsp").forward(req, resp);
    }
}
