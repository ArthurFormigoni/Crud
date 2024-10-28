package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.teste.Connection.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoinsDAO extends Conexao {

        private Connection conn;
        private PreparedStatement pstmt;
        private ResultSet rs;




        //CRUD: R = READ - SELECT
    //Mostra quantas moedas um usuário específico tem
        public ResultSet select( int idUser ) {
            conectar();
            ResultSet rset = null;
            try {

                pstmt = conn.prepareStatement("SELECT quantidade FROM moedas WHERE fk_usuario = ?");
                pstmt.setInt(1, idUser);
                rset = pstmt.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            desconectar();
            return rset;
        }

        //CRUD: U = UPDATE - UPDATE
    //Adiciona moedas ao BD_Delfis!
    public boolean criarMoedas(int id_moedas,int quantidade){
        try{
            conectar();

            pstmt =getConnection().prepareStatement("INSERT INTO moedas VALUES (?, ?, 2");

            pstmt.setInt(1,id_moedas);
            pstmt.setInt(2,quantidade);

            pstmt.executeUpdate();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    //Aumenta a quantidade de moedas de um usuário em específico
    public boolean aumentarMoedas(int id_moedas, int fk_usuario, int quantidade){
        try{
            conectar();

            pstmt = getConnection().prepareStatement("UPDATE moedas SET quantidade = quantidade + ? WHERE id_moeda = ? AND fk_usuario = ?");

            pstmt.setInt(1,id_moedas);
            pstmt.setInt(2,fk_usuario);
            pstmt.setInt(3,quantidade);

            pstmt.executeUpdate();
            return true;



        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //Diminui a quantidade de moedas de um usuário em específico
    public boolean diminuirMoedas(int id_moedas, int fk_usuario, int quantidade) {
        try {
            conectar();

            pstmt = getConnection().prepareStatement("UPDATE moedas SET quantidade = quantidade - ? WHERE id_moeda = ? AND fk_usuario = ? AND quantidade >= ?");

            pstmt.setInt(1, id_moedas);
            pstmt.setInt(2, fk_usuario);
            pstmt.setInt(3, quantidade);

            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    //Mostra Quantas moedas TODOS os usuários tem
    public boolean listarMoedas( int fk_usuario, int quantidade, String nome) {
        try {
            conectar();
            pstmt = getConnection().prepareStatement("SELECT usuario.id_usuario AS usuario_id, usuario.nome AS nome_usuario, SUM(moedas.quantidade) AS total_moedas FROM usuario LEFT JOIN moedas ON usuario.id_usuario = moedas.fk_usuario GROUP BY usuario.id_usuario ORDER BY total_moedas desc ");



            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}


