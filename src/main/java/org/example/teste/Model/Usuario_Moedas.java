package org.example.teste.Model;

public class Usuario_Moedas {

    public Usuario_Moedas(){}

    private int id_usuario;
    private String nome;
    private int total_moedas;

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public int getTotal_moedas() {
        return total_moedas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setTotal_moedas(int total_moedas) {
        this.total_moedas = total_moedas;
    }

    @Override
    public String toString() {
        return
                "Id_usuario "+ this.id_usuario+
                "Nome: "+this.nome+
                "Total_Moedas "+this.total_moedas;
    }
}
