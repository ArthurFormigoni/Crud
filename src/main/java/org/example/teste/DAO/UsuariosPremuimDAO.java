package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Classe para gerenciar dados de usuários premium
public class UsuariosPremuimDAO extends Conexao {
    private Connection conn; // Conexão com o banco de dados
    private PreparedStatement pstmt; // Comando SQL preparado

    // Insere um novo usuário premium
    public boolean insert(String sql) {
        conectar(); // Conecta ao banco de dados
        try {
            pstmt = conn.prepareStatement(sql); // Prepara o comando SQL
            pstmt.execute(); // Executa o comando
            return true; // Retorna sucesso
        } catch (SQLException sqe) {
            sqe.printStackTrace();
            return false; // Retorna falha
        } finally {
            desconectar(); // Fecha a conexão
        }
    }

    // Consulta registros de usuário com base na SQL fornecida
    public ResultSet select(String sql) {
        conectar(); // Conecta ao banco de dados
        ResultSet rset = null;
        try {
            pstmt = conn.prepareStatement(sql); // Prepara o comando SQL
            rset = pstmt.executeQuery(); // Executa a consulta
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectar(); // Fecha a conexão
        }
        return rset; // Retorna o resultado
    }

    // Atualiza usuário para plano premium
    public boolean addPremiumUser(int userId) {
        try {
            conectar(); // Conecta ao banco de dados
            pstmt = getConnection().prepareStatement("UPDATE usuario SET fk_plano = 2 WHERE id_usuario = ?");
            pstmt.setInt(1, userId); // Define o ID do usuário
            pstmt.execute(); // Executa a atualização
            return true; // Retorna sucesso
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Retorna falha
        } finally {
            desconectar(); // Fecha a conexão
        }
    }

    // Remove o usuário do plano premium
    public boolean delete(int userId) {
        try {
            conectar(); // Conecta ao banco de dados
            pstmt = getConnection().prepareStatement("UPDATE usuario SET fk_plano = 1 WHERE id_usuario = ?");
            pstmt.setInt(1, userId); // Define o ID do usuário
            pstmt.execute(); // Executa a atualização
            return true; // Retorna sucesso
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Retorna falha
        } finally {
            desconectar(); // Fecha a conexão
        }
    }

    // Método auxiliar para deletar usuário
    public boolean deleteUser(int userId) {
        return delete(userId); // Reutiliza o método delete
    }
}
