//Importações - Início
package org.example.teste.Servelts;

import java.util.regex.Pattern;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;
import org.example.teste.DAO.CoinsDAO;

import java.io.IOException;
import java.io.PrintWriter;

//Importações - Fim

//Classe - Início
@WebServlet(name = "aumentar_moedas", value = "/aumentar_moedas")
public class AumentarMoedas extends HttpServlet {
    // Métodos - Início
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String quantidadeParam = request.getParameter("quantidade");
            String idMoedasParam = request.getParameter("id_moedas");
            String fkUsuarioParam = request.getParameter("fk_usuario");


            // Verifica se os parâmetros não são nulos
            if (idMoedasParam != null && fkUsuarioParam != null && quantidadeParam != null) {
                int quantidade = Integer.parseInt(quantidadeParam);
                int idMoedas = Integer.parseInt(idMoedasParam);
                int fkUsuario = Integer.parseInt(fkUsuarioParam);


                CoinsDAO coinsDAO = new CoinsDAO();
                coinsDAO.aumentarMoedas(quantidade,idMoedas, fkUsuario);
                System.out.println("Aumentou as moedas do usuário com o registro ID: " + fkUsuario);
            } else {
                System.out.println("Parâmetros não fornecidos corretamente.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Erro ao converter os parâmetros para números: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao aumentar as moedas: " + e.getMessage());
        }

        Listar mostra = new Listar();
// A lista de administradores é adicionada ao request
        request.setAttribute("listaMoedas", mostra.listarMoedas());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("Return_JSP/aumentar_return_moedas.jsp").forward(request, response);
    }
}