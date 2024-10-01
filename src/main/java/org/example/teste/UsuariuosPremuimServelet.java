package org.example.teste;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Classes.UsuariosPremium; // Importa a classe que você criou
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "usuartios_premuim", value = "/usuarios_premuim")
public class UsuariuosPremuimServelet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<UsuariosPremium> listaUsuarios = new ArrayList<>();
        int a=0;
        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            Connection conn = DriverManager.getConnection("jdbc:postgresql://pg-389b6280-arthurformigonisantos-8675.e.aivencloud.com:21288/dbVendas?ssl=require&user=avnadmin&password=AVNS_DvqnVzl6tcqAXu6S6LL", "avnadmin", "AVNS_DvqnVzl6tcqAXu6S6LL");

            String sql = "SELECT * FROM usuario";  // Substitua com a sua tabela de usuários
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");
                a =2;
            } else {
                System.out.println("Registros encontrados!");
                a =1;
            }

            // Processa os resultados do banco de dados e cria objetos UsuariosPremium
            while (rs.next()) {
                UsuariosPremium usuario = new UsuariosPremium();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setFk_id_ranking(rs.getInt("fk_id_ranking"));
                usuario.setFk_id_plano(rs.getInt("fk_id_plano"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setDt_nasc(rs.getDate("dt_nasc")); // Use java.sql.Date
                usuario.setLevel(rs.getInt("level"));
                usuario.setPicture_url(rs.getString("picture_url"));
                usuario.setPontos(rs.getInt("pontos"));
                usuario.setDt_criacao(rs.getDate("dt_criacao")); // Use java.sql.Date

                listaUsuarios.add(usuario);
            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("oi");
        }

        // A lista de usuários é adicionada ao request
        request.setAttribute("listaUsuarios", listaUsuarios);

        response.setContentType("text/html");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("crud_return.jsp").forward(request, response);
        System.out.println("Total de usuários: " + listaUsuarios.size());
        System.out.println(a);
    }

}
