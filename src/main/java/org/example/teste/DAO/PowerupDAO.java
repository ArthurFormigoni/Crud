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
            pstmt = conn.prepareStatement("INSERT INTO nome_da_tabela (coluna1, coluna2, coluna3)" +
                    " VALUES ('valor1', 'valor2', 'valor3')");
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

            pstmt = conn.prepareStatement("SELECT coluna1, coluna2 FROM nome_da_tabela WHERE condicao");
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
            pstmt = conn.prepareStatement("UPDATE nome_da_tabela SET coluna1 = 'novo_valor1', coluna2 = 'novo_valor2' WHERE condição");


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
