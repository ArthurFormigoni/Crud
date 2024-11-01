package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;
import org.postgresql.util.PGInterval;
import org.w3c.dom.Text;
import java.sql.*;

// Classe DAO para manipulação de dados na tabela "powerup"
public class PowerupDAO extends Conexao {
    private Connection conn; // Conexão com o banco de dados
    private PreparedStatement pstmt; // Comando SQL preparado
    private ResultSet rs; // Resultado da consulta SQL

    // Insere um novo registro na tabela "powerup"
    public boolean insert(String nome, int qnt, String img, int id_powerup, int preco, double duracao) {
        conectar();
        try {
            pstmt = conn.prepareStatement("INSERT INTO powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, duracao) VALUES (?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, qnt);
            pstmt.setString(3, img);
            pstmt.setInt(4, id_powerup);
            pstmt.setInt(5, preco);
            pstmt.setDouble(6, duracao);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
        return true;
    }

    // Consulta registro na tabela "powerup" por ID
    public ResultSet select(int id_powerup) {
        conectar();
        try {
            pstmt = conn.prepareStatement("SELECT * FROM powerup WHERE id_powerup = ?");
            pstmt.setInt(1, id_powerup);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return rs;
    }

    // Executa uma atualização com o SQL fornecido
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

    // Exclui um registro na tabela "powerup" por ID
    public boolean delete(int id_powerup) {
        conectar();
        try {
            pstmt = conn.prepareStatement("DELETE FROM powerup WHERE id_powerup = ?");
            pstmt.setInt(1, id_powerup);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
        return true;
    }

    // Adiciona um novo poder à tabela "powerup" com parâmetros padrão
    public boolean adicionar_poder(String nome, int preco, int quantidade) {
        conectar();
        try {
            pstmt = conn.prepareStatement("INSERT INTO powerup (nome, quantidade, imagem_loja_url, id_powerup, preco_moedas, initial_time, duracao, is_updated, is_deleted) VALUES (?, ?, 'url_powerup', 4, ?, CURRENT_TIMESTAMP, INTERVAL '5 minutes', false, false)");
            pstmt.setString(1, nome);
            pstmt.setInt(2, quantidade);
            pstmt.setInt(3, preco);
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
