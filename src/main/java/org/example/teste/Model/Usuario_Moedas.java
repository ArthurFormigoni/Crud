//Importações  - Início

package org.example.teste.Model;

//Importações - Fim

//Classe - Início
public class Usuario_Moedas {

    //Atributos - Início
    private int id_usuario;
    private String nome;
    private int total_moedas;
    //Atributos - Fim

// Métodos - Início
    //Construtor - Início

    public Usuario_Moedas(){}

    //Construtor - Fim

    //Getters e Setters - Início
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

    //Getters e Setters - Fim

    //toString - Início
    @Override
    public String toString() {
        return
                "Id_usuario "+ this.id_usuario+
                "Nome: "+this.nome+
                "Total_Moedas "+this.total_moedas;
    }//toString - Fim

}//Métodos e Classe - Fim
