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

@WebServlet(name = "cadastro", value = "/cadastrar_adm")

public class CadastrarADM extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String nome = request.getParameter("name");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String dt_nasc = request.getParameter("dt_nasc");
            String email = request.getParameter("email");
            response.setContentType("text/html");

            String regex1 = "[A-Za-z]{4,}";
            String regex2 = "[a-z]{5,}";
            String regex3 = "[a-zA-Z]{0,}[0-9]{0,}";
            String regex5 = "^[a-z]{4,}[@][a-z]{5,}.com";
            PrintWriter out = response.getWriter();

            if (Pattern.matches(regex1, nome)){
                if (Pattern.matches(regex2, username)){
                    if (Pattern.matches(regex3, password)){
                        if (Pattern.matches(regex5, email)){
                            AdmDAO admDAO = new AdmDAO();
                            admDAO.cadastrarADM(nome, username, password, dt_nasc, email);
                        }
                    }
                }
            }
            else {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Erro</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Erro ao cadastrar</h1>");
                out.println("<body>");
                out.println("<html>");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
