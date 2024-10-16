package org.example.teste;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Classes.Adm_;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "admServelet", value = "/adm")
public class AdmServelet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Adm_> listaADM = new ArrayList<>();
        int a = 0;

        // Conectar ao banco de dados e buscar os dados
        try {
            // Configuração da conexão (substitua com seus dados)
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://pg-23037034-germinare-1db6.f.aivencloud.com:27088/dbDelfis?ssl=require&user=avnadmin&password=AVNS_IUFw8-OfVH7bf8zuL_l");
            String sql = "SELECT * FROM adm";  // Substitua com a sua tabela de usuários
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
                System.out.println("Nenhum registro encontrado!");
                a = 2;
            } else {
                System.out.println("Registros encontrados!");
                a = 1;
            }

            // Processa os resultados do banco de dados e cria objetos Adm_
            while (rs.next()) {
                Adm_ adm = new Adm_();
                adm.setId_adm(rs.getInt("id_adm")); // Aqui está correto
                adm.setLogin(rs.getString("login")); // Aqui está correto
                adm.setSenha(rs.getString("senha")); // Aqui está correto
                adm.setNome(rs.getString("nome")); // Aqui está correto
                adm.setEmail(rs.getString("email")); // Aqui está correto
                adm.setData_nascimento(rs.getString("dt_nasc")); // Converte o Date para String
                adm.setImagem_url(rs.getString("imagem_url")); // Aqui está correto
                adm.setDt_criacao(rs.getString("dt_criacao")); // Converte o Date para String

                listaADM.add(adm);
            }
            // Fecha os recursos do banco de dados
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // A lista de administradores é adicionada ao request
        request.setAttribute("listaADM", listaADM);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("crud_return_adm.jsp").forward(request, response);
        System.out.println(listaADM);
        System.out.println("Total de usuários: " + listaADM.size());
        System.out.println(a);
    }
}
