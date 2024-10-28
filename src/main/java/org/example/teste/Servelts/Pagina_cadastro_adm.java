// Importações - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO; // Classe para operações de banco de dados relacionadas ao administrador

import java.io.IOException;
import java.io.PrintWriter;
//Importações - Fim

// Define o Servlet "pagina_adm" acessível via URL "/pagina_adm"
@WebServlet(name = "pagina_adm", value = "/pagina_adm")
public class Pagina_cadastro_adm extends HttpServlet {

    // Método doGet para tratar requisições HTTP GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // Define o tipo de conteúdo da resposta
        request.getRequestDispatcher("HTML/pagina_cadastroADM.jsp").forward(request, response);
        // Redireciona a requisição para a página JSP "pagina_cadastroADM.jsp"
    }
}
