//Importações  - Início

package org.example.teste.Servelts;

import org.example.teste.DAO.AdmDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//Importações - Fim


//Classe - Início
@WebServlet(name = "deletar_adm" ,value = "/deletar_adm")
public class DeletarAdm extends HttpServlet {
    // Métodos - Início
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("id_adm"));

            AdmDAO adm2 = new AdmDAO();
            adm2.deleteAdm(id);
            System.out.println("Deletou o registro com o ID: " + id);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar o registro: " + e.getMessage());
        }
        Listar mostra = new Listar();
        // A lista de administradores é adicionada ao request
        request.setAttribute("listaADM", mostra.listarAdm());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Return_JSP/crud_return_adm.jsp").forward(request, response);
    }
}//Métodos e Classe - Fim
