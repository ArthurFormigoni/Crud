package org.example.teste.DAO;

public class main {
    public static void main(String[] args) {
        AdmDAO conexao1 = new AdmDAO();
        UsuariosPremuimDAO aa = new UsuariosPremuimDAO();
        //METODO CONECTAR
        aa.deleteUser(1);
        System.out.println("CONEXÂO");
        conexao1.conectar();


    }
}
