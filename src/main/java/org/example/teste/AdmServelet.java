//package org.example.teste;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//import Classes.Adm_;
//import Classes.UsuariosPremium; // Importa a classe que você criou
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;
//
//@WebServlet(name = "usuartios_premuim", value = "/usuarios_premuim")
//public class AdmServelet extends HttpServlet {
//
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        List<Adm_> listaADM = new ArrayList<>();
//        int a=0;
//        // Conectar ao banco de dados e buscar os dados
//        try {
//            // Configuração da conexão (substitua com seus dados)
//            Class.forName("org.postgresql.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:postgresql://pg-23037034-germinare-1db6.f.aivencloud.com:27088/dbDelfis?ssl=require&user=avnadmin&password=AVNS_IUFw8-OfVH7bf8zuL_l");
//            String sql = "SELECT * FROM usuario";  // Substitua com a sua tabela de usuários
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
//                System.out.println("Nenhum registro encontrado!");
//                a =2;
//            } else {
//                System.out.println("Registros encontrados!");
//                a =1;
//            }
//
//            // Processa os resultados do banco de dados e cria objetos UsuariosPremium
//            while (rs.next()) {
//                Adm_ adm = new Adm_();
//                adm.setLogin(rs.getString("login"));
//                //usuario.setFk_ranking(rs.getInt("fk_ranking"));
//                //usuario.setFk_plano(rs.getInt("fk_plano"));
//                //usuario.setNome(rs.getString("nome"));
//                //usuario.setEmail(rs.getString("email"));
//                //usuario.setSenha(rs.getString("senha"));
//                //usuario.setDt_nasc(rs.getDate("dt_nasc")); // Use java.sql.Date
//                //usuario.setNivel(rs.getInt("nivel"));
//                //usuario.setImagem_url(rs.getString("imagem_url"));
//                //usuario.setPontos(rs.getInt("pontos"));
//                //usuario.setDt_criacao(rs.getDate("dt_criacao")); // Use java.sql.Date
//
//                listaADM.add(adm);
//            }
//            // Fecha os recursos do banco de dados
//            rs.close();
//            stmt.close();
//            conn.close();
//
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        // A lista de usuários é adicionada ao request
//        request.setAttribute("listaUsuarios", listaADM);
//
//        response.setContentType("text/html");
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        request.getRequestDispatcher("crud_return.jsp").forward(request, response);
//        System.out.println("Total de usuários: " + listaADM.size());
//        System.out.println(a);
//    }
//
//}
