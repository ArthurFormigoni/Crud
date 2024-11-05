//Importações  - Início

package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.Model.Adm;

import java.io.*;
import java.sql.*;
//Importações - Fim

//Classe - Início
@WebServlet(name="adm",value = "/login")
public class Login extends HttpServlet {

    // Métodos - Início
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("txt");
        String senha = req.getParameter("pswd");
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://pg-23037034-germinare-1db6.f.aivencloud.com:27088/dbDelfis?ssl=require&user=avnadmin&password=AVNS_IUFw8-OfVH7bf8zuL_l");
            String sql = "select * from adm";  // Substitua com a sua tabela de usuários
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            while (rs.next()) {
                Adm adm = new Adm();
                adm.setSenha(rs.getString("senha"));
                adm.setLogin(rs.getString("login"));
                if (user.equals(adm.getLogin()) && senha.equals(adm.getSenha())) {
                    req.getRequestDispatcher("HTML/home_crud.html").forward(req, resp);
                }
            }
            req.setAttribute("teste", 1);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }catch (SQLException  | ClassNotFoundException a){
            a.printStackTrace();
        }
    }
}//Métodos e Classe - Fim