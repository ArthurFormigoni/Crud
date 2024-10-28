package org.example.teste.Servelts;

import org.example.teste.Model.UsuariosPremium; // Modelo para usuários premium
import org.example.teste.DAO.UsuariosPremuimDAO; // Acesso a dados para operações com usuários premium
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Servlet para deletar usuários premium, mapeado para "/deletar_usuario_premuim"
@WebServlet(name = "deletar_usuario_premuim", value = "/deletar_usuario_premuim")
public class DeletarUsuariosPremuim extends HttpServlet {

    // Método para processar requisições POST
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("id")); // Captura o ID do usuário premium

            // Instancia o DAO e executa a exclusão do usuário pelo ID
            UsuariosPremuimDAO usa = new UsuariosPremuimDAO();
            usa.deleteUser(id);
            System.out.println("Deletou o premium com o ID: " + id);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar o premium: " + e.getMessage());
        }

        // Atualiza a lista de usuários e redireciona para a página de resposta JSP
        Listar mostra = new Listar();
        request.setAttribute("listaUsuarios", mostra.listarUsuarioPremuim());
        response.setContentType("text/html");
        request.getRequestDispatcher("Return_JSP/crud_return_adm.jsp").forward(request, response);
    }
}
