package org.example.teste.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private Connection conn;

    protected boolean conectar(){

        try{

            // Define o driver utilizado para ocorrer a conexão
            Class.forName("org.postgresql.Driver");

            // Estabelece a conexão com o Banco de Dados
            conn = DriverManager.getConnection("jdbc:postgresql://pg-23037034-germinare-1db6.f.aivencloud.com:27088/dbDelfis?ssl=require","avnadmin", "AVNS_IUFw8-OfVH7bf8zuL_l");

            // Retornar true caso a conexão ocorrer sem nenhum problema
            return true;

        }catch (ClassNotFoundException | SQLException e){
            //Impressão da exceção
            e.printStackTrace();

            //Retorno caso não for possível estabelecer a conexão
            return false;
        }

    }

    // DESCONECTAR
    protected boolean desconectar(){
        try{
            //if para fechar a conexão caso ela exista ou esteja sendo utilizada
            if (!conn.isClosed() && conn !=null){
                conn.close();
            }

            //Retorna true ao fechar a conexão ou se ela ja estava fechada antes.
            return true;

        }catch (SQLException sqle){

            //Impressão no console
            sqle.printStackTrace();

            //Retorno caso ocorra um erro na desconexão
            return false;
        }
    }

}
