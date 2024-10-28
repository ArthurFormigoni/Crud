package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.*;

public class AdmDAO extends Conexao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    //CRUD: C = CREATE - INSERT
    //Adiciona um adm ao BD_Delfis!
    public boolean cadastrarADM(String usuario, String senha, String nome, String dt_nasc,String email){
        try{
            conectar();

            pstmt = getConn().prepareStatement("INSERT INTO adm (login, senha, nome, dt_nasc, imagem_url, dt_criacao, email) VALUES (?, ?, ?, ?, 'imagem_url_adm', current_date, ?);");

            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, nome);
            pstmt.setDate(4,  java.sql.Date.valueOf(dt_nasc));
            pstmt.setString(5, email);
            pstmt.executeUpdate();

            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    //CRUD: D = DELETE - DELETE
    //Retira um adm do DB_Delfis!
    public boolean deleteAdm(int admId) {
        try {
            conectar();
            pstmt = getConn().prepareStatement("DELETE FROM adm WHERE id_adm = ?");
            pstmt.setInt(1, admId);
            pstmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            desconectar();
        }
        return true;
    }


    //CRUD: U = UPDATE - UPDATE
    //Altera TUDO menos o id, o id é usado para identificar aonde deve alterar
    public boolean updateAdm(String login, String senha, String nome, String dt_nasc , String email,int id_adm){
        try {
            conectar();
            pstmt = getConn().prepareStatement("update adm set login = ? , senha = ?, nome = ? , dt_nasc =?, email =?  WHERE id_adm = ?");
            pstmt.setString(1,login);
            pstmt.setString(2,senha);
            pstmt.setString(3,nome);
            pstmt.setDate(4,java.sql.Date.valueOf(dt_nasc));
            pstmt.setString(5,email);
            pstmt.setInt(6,id_adm);
            pstmt.executeUpdate();

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        finally {
            desconectar();
        }
    }

}
