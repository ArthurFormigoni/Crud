package org.example.teste.Servelts;

import org.example.teste.Model.UsuariosPremium;
import org.example.teste.DAO.UsuariosPremuimDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "deletar_usuario_premuim",value = "/deletar_usuario_premuim")
public class DeletarUsuariosPremuim extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Obtém o parâmetro "id" da requisição e converte para um inteiro (ID do usuário premium a ser deletado)
            int id = Integer.parseInt(request.getParameter("id"));

            // Instancia o objeto UsuariosPremuimDAO para realizar operações no banco de dados
            UsuariosPremuimDAO usa = new UsuariosPremuimDAO();
            // Chama o método deleteUser para deletar o usuário premium com o ID especificado
            usa.deleteUser(id);

            // Log para confirmação no console de que o registro do usuário premium foi deletado com sucesso
            System.out.println("Deletou o premium com o ID: " + id);

        } catch (Exception e) {
            // Log de erro e exibição da mensagem de exceção no console caso haja falha na exclusão
            e.printStackTrace();
            System.out.println("Erro ao deletar o premium: " + e.getMessage());
        }

        // Instancia um objeto Listar para obter a lista atualizada de usuários premium
        Listar mostra = new Listar();
        // A lista de usuários premium é adicionada como um atributo na requisição
        request.setAttribute("listaUsuarios", mostra.listarUsuarioPremuim());

        // Define o tipo de conteúdo da resposta como HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Encaminha a requisição e resposta para a página JSP "crud_return_adm.jsp" que exibe o resultado
        request.getRequestDispatcher("Return_JSP/crud_return_adm.jsp").forward(request, response);
    }
}