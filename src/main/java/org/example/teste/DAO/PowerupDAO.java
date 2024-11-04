//importações
package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import org.postgresql.util.PGInterval;
import org.w3c.dom.Text;
import java.sql.*;

// Classe DAO para manipulação de dados da tabela "powerup"
public class PowerupDAO extends Conexao {

    private PreparedStatement pstmt;
    private ResultSet rs;

    // CREATE: insere um novo registro de powerup
    public boolean insert(String nome, int qnt, String img, int id_powerup, int preco, double duracao) {
        conectar();
        try {
            pstmt = conn.prepareStatement("INSERT INTO powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, duracao)" +
                    " VALUES (?, ?, 'imagem_url', ?+1, ?, ?, false, false)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, qnt);
            pstmt.setInt(3, id_powerup);
            pstmt.setInt(4, preco);
            pstmt.setDouble(5, duracao);
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
    public boolean updatePoder(int id_powerup, String nome, int qnt, double preco) {
        conectar();
        try {
            pstmt = conn.prepareStatement("UPDATE powerup SET nome = ? SET quantidade = ? SET preco = ? WHERE id_powerup = ?");
            pstmt.setString(1, nome);
            pstmt.setInt(2, qnt);
            pstmt.setDouble(3, preco);
            pstmt.setInt(4, id_powerup);

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
    public boolean deletePoderes(int id_powerup) {
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
    public boolean adicionar_poder(String nome, double preco, int quantidade){
        conectar();
        try{
            pstmt = getConn().prepareStatement("INSERT INTO Powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, initial_time, duracao, is_updated, is_deleted) VALUES (?, ?, 'url_powerup', 4, ?, CURRENT_TIMESTAMP, INTERVAL '5 minutes', false, false)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, quantidade);
            pstmt.setDouble(3, preco);
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
