package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import org.postgresql.util.PGInterval;
import org.w3c.dom.Text;

import java.sql.*;

public class PowerupDAO extends Conexao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    //CRUD: C = CREATE - INSERT
    public boolean insert(String nome, int qnt, String img, int id_powerup, int preco, double duracao) {
        conectar();
        try {
            pstmt = conn.prepareStatement("INSERT INTO powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, duracao)" +
                    " VALUES (''?'', ?, ''?'', ?, ?, ?)");//Ver se o [INTERVAL] é String ou não para colocar entre ('')
            pstmt.setString(1, nome);
            pstmt.setInt(2, qnt);
            pstmt.setString(3, img);
            pstmt.setInt(4, id_powerup);
            pstmt.setInt(5, preco);
            pstmt.setDouble(5, duracao);
            pstmt.execute();
        } catch (SQLException sqe) {
            sqe.printStackTrace();
            return false;
        }
        desconectar();
        return true;
    }

    //CRUD: R = READ - SELECT
    public ResultSet select(int id_powerup) {
        conectar();
        ResultSet rset = null;
        try {

            pstmt = conn.prepareStatement("SELECT * FROM powerup WHERE id_powerup = ?");
            pstmt.setInt(1, id_powerup);
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
            pstmt = conn.prepareStatement("UPDATE nome_da_tabela SET coluna1 = 'novo_valor1', coluna2 = 'novo_valor2' WHERE ?");


            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        desconectar();
        return true;
    }

    //CRUD: D = DELETE - DELETE
    public boolean delete(int id_powerup) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM powerup WHERE id_powerup = ?");
            pstmt.setInt(1, id_powerup);
            pstmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
        return true;
    }
}