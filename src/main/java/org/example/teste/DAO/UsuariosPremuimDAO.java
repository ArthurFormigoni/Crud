package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Classe para gerenciar dados de usuários premium
public class UsuariosPremuimDAO extends Conexao {
    private Connection conn;
    private PreparedStatement pstmt;

    // Insere um novo usuário premium
    public boolean insert(String sql) {
        conectar();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            return true;
        } catch (SQLException sqe) {
            sqe.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
    }

    // Consulta registros de usuário com base na SQL fornecida
    public ResultSet select(String sql) {
        conectar();
        ResultSet rset = null;
        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return rset;
    }

    // Atualiza usuário para plano premium
    public boolean addPremiumUser(int userId) {
        try {
            conectar();
            pstmt = getConnection().prepareStatement("UPDATE usuario SET fk_plano = 2 WHERE id_usuario = ?");
            pstmt.setInt(1, userId);
            pstmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
    }

    // Deleta o usuário do plano premium
    public boolean delete(int userId) {
        try {
            conectar();
            pstmt = getConnection().prepareStatement("UPDATE usuario SET fk_plano = 1 WHERE id_usuario = ?");
            pstmt.setInt(1, userId);
            pstmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
    }

    // Método para deletar usuário
    public boolean deleteUser(int userId) {
        return delete(userId);
    }
}
