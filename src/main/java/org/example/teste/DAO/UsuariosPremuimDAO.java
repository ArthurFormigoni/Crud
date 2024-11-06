package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Classe para gerenciar dados de usuários premium
public class UsuariosPremuimDAO extends Conexao {
    private PreparedStatement pstmt;

    // Insere um novo usuário premium


    // Atualiza usuário para plano premium
    public boolean addPremiumUser(int userId) {
        try {
            conectar();
            pstmt = getConn().prepareStatement("UPDATE usuario SET fk_plano = 2 WHERE id_usuario = ?");
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
            pstmt = getConn().prepareStatement("UPDATE usuario SET fk_plano = 1 WHERE id_usuario = ?");
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

    public boolean upadateUserPremuim(String nome,String senha , int pontos, String dt_nasc,String email , int userId){
        try {
            conectar();
            pstmt = getConn().prepareStatement("UPDATE usuario SET nome = ? , senha =? ,pontos = ? ,dt_nasc = ? , email = ?, is_updated = true  WHERE id_usuario = ?");
            pstmt.setString(1, nome);
            pstmt.setString(2, senha);
            pstmt.setInt(3, pontos);
            pstmt.setDate(4, java.sql.Date.valueOf(dt_nasc));
            pstmt.setString(5, email);
            pstmt.setInt(6, userId);
            pstmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }

    }
}
