// Importações - Início

package org.example.teste.Servelts;

import java.util.regex.Pattern;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.DAO.AdmDAO;

import java.io.IOException;
import java.io.PrintWriter;

// Classe Servlet para cadastro de administradores
@WebServlet(name = "cadastro", value = "/cadastrar_adm")
public class CadastrarADM extends HttpServlet {

    // Método executado para requisições GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            // Captura parâmetros de entrada do formulário
            String nome = request.getParameter("name");
            String username = request.getParameter("Login");
            String password = request.getParameter("password");
            String dt_nasc = request.getParameter("dt_nasc");
            String email = request.getParameter("email");
            response.setContentType("text/html");

            // Validações de dados com expressões regulares
            String regexNome = "[A-Za-z]{3,}";
            String regexUsername = "[a-z]{5,}";
            String regexSenha = "[a-zA-Z]{0,}[0-9]{0,}";
            String regexEmail = "^[a-z]{4,}[@][a-z]{5,}.com";

            PrintWriter out = response.getWriter();

            // Verifica se os dados estão no formato correto
            if (Pattern.matches(regexNome, nome) && Pattern.matches(regexUsername, username) &&
                    Pattern.matches(regexSenha, password) && Pattern.matches(regexEmail, email)) {

                // Dados válidos: cadastra o novo administrador e redireciona para a página de sucesso
                AdmDAO admDAO = new AdmDAO();
                admDAO.cadastrarADM(username, password, nome, dt_nasc, email);
                request.setAttribute("verificar", 2);
                request.getRequestDispatcher("Return_JSP/cadastro_return.jsp").forward(request, response);

            }else {

            }

        } catch (Exception e) {
            e.printStackTrace(); // Exibe detalhes do erro no console
        }
    }
}
