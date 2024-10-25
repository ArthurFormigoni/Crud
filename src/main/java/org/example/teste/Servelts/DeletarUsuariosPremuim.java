//Importações  - Início

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
//Importações - Fim


//Classe - Início
@WebServlet(name = "deletar_usuario_premuim",value = "/deletar_usuario_premuim")
public class DeletarUsuariosPremuim extends HttpServlet {

    // Métodos - Início
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));


            UsuariosPremuimDAO usa = new UsuariosPremuimDAO();
            usa.deleteUser(id);
            System.out.println("Deletou o premium com o ID: " + id);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar o premium: " + e.getMessage());
        }
        Listar mostra = new Listar();
        // A lista de usuários é adicionada ao request
        request.setAttribute("listaUsuarios", mostra.listarUsuarioPremuim());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Return_JSP/crud_return_adm.jsp").forward(request, response);
    }
}//Métodos e Classe - Fim
