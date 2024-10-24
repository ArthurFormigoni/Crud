//Importações  - Início

package org.example.teste.Model;

//Importações - Fim

//Classe - Início
public class Powerup {
    //Atributos - Início
    private String nome;
    private int quantidade;
    private String imagem_loja_url;
    private int id_powerup;
    private int preco_moedas;
    private String initial_time;
    private String durucao;
    private String final_time;
    //Atributos - Fim

// Métodos - Início
    //Construtor - Início
    public Powerup(){}

    public Powerup(String nome, int quantidade, String imagem_loja_url, int id_powerup, int preco_moedas, String initial_time, String durucao, String final_time) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.imagem_loja_url = imagem_loja_url;
        this.id_powerup = id_powerup;
        this.preco_moedas = preco_moedas;
        this.initial_time = initial_time;
        this.durucao = durucao;
        this.final_time = final_time;

    }
    //Construtor - Fim

    //Getters e Setters - Início


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getImagem_loja_url() {
        return imagem_loja_url;
    }

    public void setImagem_loja_url(String imagem_loja_url) {
        this.imagem_loja_url = imagem_loja_url;
    }

    public int getId_powerup() {
        return id_powerup;
    }

    public void setId_powerup(int id_powerup) {
        this.id_powerup = id_powerup;
    }

    public int getPreco_moedas() {
        return preco_moedas;
    }

    public void setPreco_moedas(int preco_moedas) {
        this.preco_moedas = preco_moedas;
    }

    public String getInitial_time() {
        return initial_time;
    }

    public void setInitial_time(String initial_time) {
        this.initial_time = initial_time;
    }

    public String getDurucao() {
        return durucao;
    }

    public void setDurucao(String durucao) {
        this.durucao = durucao;
    }

    public String getFinal_time() {
        return final_time;
    }

    public void setFinal_time(String final_time) {
        this.final_time = final_time;
    }
    //Getters e Setters - Fim


    //toString - Início
    @Override
    public String toString() {
        return "Nome: " +this.nome+
                "\nQuantidade: "+this.quantidade+
                "\nStore_picutere_url: " +this.imagem_loja_url+
                "\nId_powerup: "+this.id_powerup+
                "\nPreço_moedas"+this.preco_moedas+
                "\nInitial_time: "+this.initial_time+
                "\nDuração"+this.durucao+
                "\nFinal_time: "+this.final_time;
    }//toString - Fim


}//Métodos e Classe - Fim
