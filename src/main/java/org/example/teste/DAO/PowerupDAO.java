package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.*;

public class PowerupDAO extends Conexao {
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