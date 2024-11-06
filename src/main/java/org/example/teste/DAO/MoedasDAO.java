//importações
package org.example.teste.DAO;

import org.example.teste.Connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MoedasDAO extends Conexao {


    private PreparedStatement pstmt; // Comando SQL preparado


    // Aumento da quantidade de moedas
    public boolean aumentarMoedas(int quantidade, int id_moedas, int fk_usuario) {
        try {
            conectar();
            pstmt = getConn().prepareStatement("UPDATE moedas SET quantidade = quantidade + ?, is_updated = true WHERE id_moedas = ? AND fk_usuario = ?");
            pstmt.setInt(1, quantidade);
            pstmt.setInt(2, id_moedas);
            pstmt.setInt(3, fk_usuario);
            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



    // Substituição da quantidade de moedas
    public boolean substituirMoedas(int quantidade, int id_moedas, int id_usuario) {
        try {
            conectar();
            pstmt = getConn().prepareStatement("UPDATE moedas SET quantidade = ?, is_updated = true WHERE id_moedas = ? AND fk_usuario = ?");
            pstmt.setInt(1, quantidade);
            pstmt.setInt(2, id_moedas);
            pstmt.setInt(3, id_usuario);
            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            desconectar();
        }
    }
}

