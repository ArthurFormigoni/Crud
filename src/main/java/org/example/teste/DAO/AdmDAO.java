package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.*;

public class AdmDAO extends Conexao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;








    //CRUD: R = READ - SELECT
    public ResultSet select(String sql) {
        conectar();
        ResultSet rset = null;
        try {

            pstmt = conn.prepareStatement("Select * From Adm");
            rset = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        desconectar();
        return rset;
    }

    //CRUD: U = UPDATE - UPDATE
    public boolean update(String sql) {
        conectar();
        try {
            pstmt = conn.prepareStatement("UPDATE Adm SET nome = ?, email = ? WHERE id = ?");

            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        desconectar();
        return true;
    }



    public boolean cadastrarADM(String usuario, String senha, String nome, String dt_nasc,String email){
        try{
            conectar();

            pstmt = conn.prepareStatement("INSERT INTO adm VALUES (?, ?, ?, ?, 'imagem_url_adm', current_date, ?, 10");

            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, nome);
            pstmt.setString(4, dt_nasc);
            pstmt.setString(5, email);
            pstmt.executeUpdate();

            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteAdm(int admId) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://pg-23037034-germinare-1db6.f.aivencloud.com:27088/dbDelfis?ssl=require&user=avnadmin&password=AVNS_IUFw8-OfVH7bf8zuL_l");
            pstmt = conn.prepareStatement("DELETE FROM adm WHERE id_adm = ?");
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

}
