package org.example.teste.DAO;

// Importa bibliotecas necessárias para trabalhar com variáveis de ambiente e conexão com o banco de dados
import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.*;

// Classe AdmDAO, que herda da classe Conexao,0
public class AdmDAO extends Conexao {
    private PreparedStatement pstmt; // Declaração do objeto PreparedStatement para executar consultas SQL

    // CRUD: C = CREATE - INSERE um novo administrador no banco de dados
    public boolean cadastrarADM(String usuario, String senha, String nome, String dt_nasc, String email) {
        try {
            conectar(); // Estabelece uma conexão com o banco de dados

            // Prepara a instrução SQL para inserir um novo administrador
            pstmt = getConn().prepareStatement("INSERT INTO adm (login, senha, nome, dt_nasc, imagem_url, dt_criacao, email) VALUES (?, ?, ?, ?, 'imagem_url_adm', current_date, ?);");

            // Define os valores dos parâmetros na consulta
            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, nome);
            pstmt.setDate(4, java.sql.Date.valueOf(dt_nasc)); // Converte a data de nascimento para o formato SQL
            pstmt.setString(5, email);
            pstmt.executeUpdate(); // Executa a consulta

            return true; // Retorna verdadeiro se a operação for bem-sucedida
        } catch (Exception e) {
            e.printStackTrace(); // Imprime o stack trace em caso de erro
            return false; // Retorna falso se houver erro
        }finally {
            desconectar();
        }
    }

    // CRUD: D = DELETE - REMOVE um administrador do banco de dados
    public boolean deleteAdm(int admId) {
        try {
            conectar(); // Conecta ao banco de dados
            pstmt = getConn().prepareStatement("DELETE FROM adm WHERE id_adm = ?"); // Prepara a consulta de exclusão
            pstmt.setInt(1, admId); // Define o ID do administrador a ser excluído
            pstmt.execute(); // Executa a consulta
        } catch (Exception e) {
            e.printStackTrace(); // Imprime o stack trace em caso de erro
            return false; // Retorna falso se houver erro
        } finally {
            desconectar(); // Garante que a conexão seja encerrada
        }
        return true; // Retorna verdadeiro se a exclusão for bem-sucedida
    }

    // CRUD: U = UPDATE - ATUALIZA os dados de um administrador, exceto o ID
    public boolean updateAdm(String login, String senha, String nome, String dt_nasc, String email, int id_adm) {
        try {
            conectar(); // Conecta ao banco de dados
            // Prepara a consulta de atualização
            pstmt = getConn().prepareStatement("UPDATE adm SET login = ?, senha = ?, nome = ?, dt_nasc = ?, email = ? WHERE id_adm = ?");
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            pstmt.setString(3, nome);
            pstmt.setDate(4, java.sql.Date.valueOf(dt_nasc)); // Converte a data para o formato SQL
            pstmt.setString(5, email);
            pstmt.setInt(6, id_adm); // Define o ID do administrador que será atualizado
            pstmt.executeUpdate(); // Executa a consulta

            return true; // Retorna verdadeiro se a operação for bem-sucedida
        } catch (Exception e) {
            e.printStackTrace(); // Imprime o stack trace em caso de erro
            return false; // Retorna falso se houver erro
        } finally {
            desconectar(); // Garante que a conexão seja encerrada
        }
    }
}