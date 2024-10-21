package org.example.teste.Connection;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private Connection conn;

    protected boolean conectar(){
        Dotenv dotenv = Dotenv.load();

        String url = dotenv.get("DB_HOST");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");

        try{

            // Define o driver utilizado para ocorrer a conexão
            Class.forName("org.postgresql.Driver");

            // Estabelece a conexão com o Banco de Dados
            conn = DriverManager.getConnection(url, user, password);
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
