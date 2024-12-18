// Importações - Início

package org.example.teste.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//Importações - Fim

// Define o Servlet "pagina_adm" acessível via URL "/pagina_adm"
@WebServlet(name = "pagina_adm", value = "/pagina_adm")
public class Pagina_cadastro_adm extends HttpServlet {

    // Método doGet para tratar requisições HTTP GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // Define o tipo de conteúdo da resposta
        request.getRequestDispatcher("Cadastro_JSP/pagina_cadastroADM.jsp").forward(request, response);
        // Redireciona a requisição para a página JSP "pagina_cadastroADM.jsp"
    }
}
