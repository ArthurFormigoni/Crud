package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoinsDAO extends Conexao {

        private Connection conn;
        private PreparedStatement pstmt;
        private ResultSet rs;



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
        public ResultSet select( int idUser ) {
            conectar();
            ResultSet rset = null;
            try {

                pstmt = conn.prepareStatement("SELECT quantidade FROM moedas WHERE fk_usuario = ?");
                pstmt.setInt(1, idUser);
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

            pstmt =getConnection().prepareStatement("INSERT INTO moedas VALUES (?, ?, 2");

            pstmt.setInt(1,id_moedas);
            pstmt.setInt(2,quantidade);

            pstmt.executeUpdate();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean aumentarMoedas(int quantidade, int id_moedas, int fk_usuario){
        try{
            conectar();

            pstmt = getConnection().prepareStatement("UPDATE moedas SET quantidade = quantidade + ? WHERE id_moedas = ? AND fk_usuario = ?");
            pstmt.setInt(1,quantidade);
            pstmt.setInt(2,id_moedas);
            pstmt.setInt(3,fk_usuario);


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

            pstmt = getConnection().prepareStatement("UPDATE moedas SET quantidade = quantidade - ? WHERE id_moeda = ? AND fk_usuario = ? AND quantidade >= ?");

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
    public boolean listarMoedas( int fk_usuario, int quantidade, String nome) {
        try {
            conectar();
            pstmt = getConnection().prepareStatement("SELECT usuario.id_usuario AS usuario_id, usuario.nome AS nome_usuario, SUM(moedas.quantidade) AS total_moedas FROM usuario LEFT JOIN moedas ON usuario.id_usuario = moedas.fk_usuario GROUP BY usuario.id_usuario ORDER BY total_moedas desc ");



            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    public boolean substituirMoedas(int quantidade, int id_moedas, int id_usuario){
        try{
            conectar();

            pstmt = getConnection().prepareStatement("UPDATE moedas SET quantidade = ? WHERE id_moedas = ? AND fk_usuario = ?");
            pstmt.setInt(1,quantidade);
            pstmt.setInt(2,id_moedas);
            pstmt.setInt(3,id_usuario);


            pstmt.executeUpdate();
            return true;



        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}


