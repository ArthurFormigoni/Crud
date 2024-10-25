package org.example.teste.Connection;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection conn;

    public boolean conectar() {
        Dotenv dotenv = Dotenv.load();
        String url = dotenv.get("DB_HOST");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");

        try {
            System.out.println("Tentando conectar ao banco de dados..."); // Log para depuração
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!"); // Log para sucesso
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados:"); // Log para falha
            e.printStackTrace(); // Isso imprimirá o erro no log do servidor
            return false;
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public Connection getConn() {
        return conn;
    }

    public void fecharConexao() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
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



