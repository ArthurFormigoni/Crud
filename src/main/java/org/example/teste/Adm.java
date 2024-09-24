package org.example.teste;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet(name="adm",value = "/login")
public class Adm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("txt");
        String senha = req.getParameter("pswd");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if (user.equals("ADM") && senha.equals("123")){
            req.getRequestDispatcher("home_crud.html").forward(req, resp);
        }else {
            out.println("<html><body>");
            out.println("<h1> Senha incorreta </h1>");
            out.println("</body></html>");
        }
    }
}
