package org.example.teste.Servelts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.teste.Connection.Conexao;
import org.example.teste.Model.Adm_;
import org.example.teste.Model.Powerup;

import java.io.*;
        import java.sql.*;

@WebServlet(name="adm",value = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Conexao conexao = new Conexao();
        conexao.conectar();
        String user = req.getParameter("txt");
        String senha = req.getParameter("pswd");
        try {
            Connection conn = conexao.getConn();
            String sql = "select * from adm";  // Substitua com a sua tabela de usuários
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            while (rs.next()) {
                Adm_ adm = new Adm_();
                adm.setSenha(rs.getString("senha"));
                adm.setLogin(rs.getString("login"));
                if (user.equals(adm.getLogin()) && senha.equals(adm.getSenha())) {
                    req.getRequestDispatcher("HTML/home_crud.html").forward(req, resp);
                }
            }
            req.setAttribute("teste", 1);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }catch (SQLException   a){
            a.printStackTrace();
        }
    }
}