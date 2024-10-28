package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import org.postgresql.util.PGInterval;
import org.w3c.dom.Text;
import java.sql.*;

// Classe DAO para manipulação de dados da tabela "powerup"
public class PowerupDAO extends Conexao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // CREATE: insere um novo registro de powerup
    public boolean insert(String nome, int qnt, String img, int id_powerup, int preco, double duracao) {
        conectar();
        try {
            pstmt = conn.prepareStatement("INSERT INTO powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, duracao)" +
                    " VALUES (?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, qnt);
            pstmt.setString(3, img);
            pstmt.setInt(4, id_powerup);
            pstmt.setInt(5, preco);
            pstmt.setDouble(6, duracao);
            pstmt.execute();
        } catch (SQLException sqe) {
            sqe.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
        return true;
    }

    // READ: consulta registros de powerup pelo ID
    public ResultSet select(int id_powerup) {
        conectar();
        ResultSet rset = null;
        try {
            pstmt = conn.prepareStatement("SELECT * FROM powerup WHERE id_powerup = ?");
            pstmt.setInt(1, id_powerup);
            rset = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return rset;
    }

    // UPDATE: executa uma atualização com a consulta SQL fornecida
    public boolean update(String sql) {
        conectar();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
        return true;
    }

    // DELETE: exclui um registro de powerup pelo ID
    public boolean delete(int id_powerup) {
        conectar();
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
    public boolean adicionar_poder(String nome, int duracao, int preco, int quantidade){
        conectar();
        try{
            pstmt = conn.prepareStatement("INSERT INTO powerup(nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, initial_time, duracao, final_time, is_updated, is_deleted) VALUES (?, ?, 'imagem_url', 3, ?, CURRENT_TIMESTAMP, INTERVAL'? minutes', false, false)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, quantidade);
            pstmt.setInt(3, preco);
            pstmt.setInt(4, duracao);
            pstmt.execute();

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        finally {
            desconectar();
        }
        return true;
    }
}
