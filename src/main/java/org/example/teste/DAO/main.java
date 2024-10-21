package org.example.teste.DAO;

import org.example.teste.Connection.Conexao;

import java.sql.SQLException;

public class main extends Conexao {

    public void teste() {
        if (conectar()) {
            System.out.println("Conexão com o banco de dados realizada com sucesso!");
        } else {
            System.out.println("Falha na conexão com o banco de dados.");
        }
    }

    public static void main(String[] args) {
        main main = new main();
        main.teste();
    }

}
