package org.example.teste.DAO;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conectar {
    private Connection conn;
    public boolean conectar() {

        Dotenv dotenv = Dotenv.load();

        String url = dotenv.get("DB_HOST");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");


        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão estabelecida com sucesso!");
            return true; // Retorna true se a conexão foi bem-sucedida
        } catch (SQLException sqle) {
            System.err.println("Erro de SQL: " + sqle.getMessage());
            return false; // Retorna false em caso de falha
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Driver não encontrado: " + cnfe.getMessage());
            return false; // Retorna false se o driver não for encontrado
        }
    }
}
