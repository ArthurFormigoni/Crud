package org.example.teste.Servlet;

// Importações necessárias para a configuração do Servlet e acesso ao modelo e DAO de usuários
import org.example.teste.Listar.Listar;
import org.example.teste.DAO.UsuariosPremiumDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// Configuração do Servlet para responder às requisições na URL /deletar_usuario_premuim
@WebServlet(name = "deletar_usuario_premium", value = "/deletar_usuario_premium")
public class DeletarUsuariosPremium extends HttpServlet {

    // Método para tratamento de requisições POST
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Obtém o ID do usuário a ser deletado a partir do parâmetro "id_user"
            int id = Integer.parseInt(request.getParameter("id_user"));

            // Instancia o DAO de usuários premium para realizar a operação de exclusão
            UsuariosPremiumDAO usa = new UsuariosPremiumDAO();
            usa.deleteUser(id);  // Chama o método de exclusão do DAO
            System.out.println("Deletou o premium com o ID: " + id);

        } catch (Exception e) {
            // Exibe o erro no console caso ocorra uma falha ao deletar o usuário
            e.printStackTrace();
            System.out.println("Erro ao deletar o premium: " + e.getMessage());
        }

        // Instancia o objeto responsável por listar usuários e adiciona a lista ao request
        Listar mostra = new Listar();
        request.setAttribute("listaUsuarios", mostra.listarUsuarioPremuim());

        // Define o tipo de conteúdo da resposta como HTML e encaminha para a página de retorno
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Return_JSP/crud_return_user.jsp").forward(request, response);
    }
}
