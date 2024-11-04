package org.example.teste.Connection;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection conn; // Declarando a variável de conexão

    // Método para estabelecer a conexão com o banco de dados
    public boolean conectar() {
        // Carregamento das variáveis de ambiente usando a biblioteca Dotenv
        Dotenv dotenv = Dotenv.load();
        String url = dotenv.get("DB_HOST"); // Obtém a URL do banco de dados
        String user = dotenv.get("DB_USER"); // Obtém o nome de usuário do banco de dados
        String password = dotenv.get("DB_PASSWORD"); // Obtém a senha do banco de dados

        try {
            System.out.println("Tentando conectar ao banco de dados..."); // print para depuração
            Class.forName("org.postgresql.Driver"); // Carrega o driver do PostgreSQL
            conn = DriverManager.getConnection(url, user, password); // Estabelece a conexão
            System.out.println("Conexão realizada com sucesso!"); // print para sucesso
            return true; // Retorna true se a conexão for bem-sucedida
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados:"); // print para falha
            e.printStackTrace(); // Imprime a pilha de erros no log do servidor
            return false; // Retorna falso se ocorrer um erro
        }
    }




    // Método para obter a conexão atual
    public Connection getConn() {
        return conn; // Retorna o objeto de conexão
    }

    // Método protegido para desconectar do banco de dados
    protected boolean desconectar() {
        try {
            // Verifica se a conexão não está fechada e não é nula antes de fechar
            if (!conn.isClosed() && conn != null) {
                conn.close(); // Fecha a conexão
            }

            // Retorna true se a conexão foi fechada ou já estava fechada
            return true;

        } catch (SQLException sqle) {
            // Imprime a pilha de erros caso ocorra uma exceção
            sqle.printStackTrace();

            // Retorno caso ocorra um erro na desconexão
            return false;
        }
    }
}



