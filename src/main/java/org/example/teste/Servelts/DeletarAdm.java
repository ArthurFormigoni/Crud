package org.example.teste.Servelts;

import org.example.teste.DAO.AdmDAO; // Classe de acesso a dados para operações com administradores
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Servlet mapeado para deletar administradores via URL "/deletar_adm"
@WebServlet(name = "deletar_adm", value = "/deletar_adm")
public class DeletarAdm extends HttpServlet {

    // Método que lida com requisições POST para deletar um administrador
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Captura o ID do administrador enviado no request e tenta deletá-lo do banco de dados
            int id = Integer.parseInt(request.getParameter("id_adm"));
            AdmDAO adm2 = new AdmDAO();
            adm2.deleteAdm(id);
            System.out.println("Deletou o registro com o ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar o registro: " + e.getMessage());
        }

        // Após deletar, prepara e redireciona para uma página com a lista atualizada de administradores
        Listar mostra = new Listar();
        request.setAttribute("listaADM", mostra.listarAdm());
        response.setContentType("text/html");
        request.getRequestDispatcher("Return_JSP/crud_return_adm.jsp").forward(request, response);
    }
}

