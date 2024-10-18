package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoinsDAO {

        private Connection conn;
        private PreparedStatement pstmt;
        private ResultSet rs;

        public boolean conectar() {

            Dotenv dotenv = Dotenv.load();

            String url = dotenv.get("DB_HOST");
            String user = dotenv.get("DB_USER");
            String password = dotenv.get("DB_PASSWORD");

            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão estabelecida com sucesso!");
                return true; // Retorna true se a conexão foi bem-sucedida
            } catch (SQLException sqle) {
                System.err.println("Erro de SQL: " + sqle.getMessage());
                return false; // Retorna false em caso de falha
            } catch (ClassNotFoundException cnfe) {
                System.err.println("Driver não encontrado: " + cnfe.getMessage());
                return false; // Retorna false se o driver não for encontrado
            }
        }

        public void desconectar() {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException sqle) {
                System.out.println(sqle.getMessage());
            }
        }

        //CRUD: C = CREATE - INSERT
        public boolean insert(String sql) {
            conectar();
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.execute();
            } catch (SQLException sqe) {
                sqe.printStackTrace();
                return false;
            }
            desconectar();
            return true;
        }

        //CRUD: R = READ - SELECT
        public ResultSet select(String sql) {
            conectar();
            ResultSet rset = null;
            try {

                pstmt = conn.prepareStatement(sql);
                rset = pstmt.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            desconectar();
            return rset;
        }

        //CRUD: U = UPDATE - UPDATE
        public boolean update(String sql) {
            conectar();
            try {
                pstmt = conn.prepareStatement(sql);

                pstmt.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            desconectar();
            return true;
        }

        //CRUD: D = DELETE - DELETE
        public boolean delete(String sql) {
            try {
                conectar();

                pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            desconectar();
            return true;
        }
    public boolean criarMoedas(int id_moedas,int quantidade){
        try{
            conectar();

            pstmt = conn.prepareStatement("INSERT INTO moedas VALUES (?, ?, 2");

            pstmt.setInt(1,id_moedas);
            pstmt.setInt(2,quantidade);

            pstmt.executeUpdate();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean aumentarMoedas(int id_moedas, int fk_usuario, int quantidade){
        try{
            conectar();

            pstmt = conn.prepareStatement("UPDATE moedas SET quantidade = quantidade + ? WHERE id_moeda = ? AND fk_usuario = ?");

            pstmt.setInt(1,id_moedas);
            pstmt.setInt(2,fk_usuario);
            pstmt.setInt(3,quantidade);

            pstmt.executeUpdate();
            return true;



        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean diminuirMoedas(int id_moedas, int fk_usuario, int quantidade) {
        try {
            conectar();

            pstmt = conn.prepareStatement("UPDATE moedas SET quantidade = quantidade - ? WHERE id_moeda = ? AND fk_usuario = ? AND quantidade >= ?");

            pstmt.setInt(1, id_moedas);
            pstmt.setInt(2, fk_usuario);
            pstmt.setInt(3, quantidade);

            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}

