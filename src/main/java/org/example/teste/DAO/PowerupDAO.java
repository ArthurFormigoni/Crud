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



    // DELETE: exclui um registro de powerup pelo ID
    public boolean delete(int id_powerup) {
        conectar();
        try {
            pstmt = conn.prepareStatement("UPDATE powerup SET is_deleted = true WHERE id_powerup = ?");
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
    public boolean adicionar_poder(String nome, int preco, int quantidade, int id_powerup){
        conectar();
        try{
            pstmt = getConn().prepareStatement("INSERT INTO Powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, initial_time, duracao, is_updated, is_deleted) VALUES (?, ?, 'url_powerup', ?, ?, CURRENT_TIMESTAMP, INTERVAL '5 minutes', false, false)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, quantidade);
            pstmt.setInt(3, id_powerup);
            pstmt.setInt(4, preco);
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

    public boolean updatePoder(int id_powerup, String nome, int qnt, double preco) {
        conectar();
        try {
            pstmt = conn.prepareStatement("UPDATE powerup SET nome = ? , quantidade = ?, preco_moedas = ?, is_updated = true WHERE id_powerup = ?");
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
}
