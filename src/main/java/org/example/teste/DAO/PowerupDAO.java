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
}
