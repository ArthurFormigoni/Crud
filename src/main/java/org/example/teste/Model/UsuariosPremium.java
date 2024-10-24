//Importações  - Início

package org.example.teste.Model;

import java.sql.Date; // ou java.time.LocalDate se preferir

//Importações - Fim

//Classe - Início
public class UsuariosPremium {
    //Atributos - Início
    private int id_usuario;
    private int fk_ranking;
    private int fk_plano;
    private String nome;
    private String email;
    private String senha;
    private Date dt_nasc; // ou LocalDate
    private int nivel;
    private String imagem_url;
    private int pontos;
    private Date dt_criacao; // ou LocalDate
    private String login;
    private int fk_role_usuario;
    //Atributos - Fim

// Métodos - Início
    //Construtor - Início

    public UsuariosPremium() {
    }

    public UsuariosPremium(int id_usuario, int fk_ranking, int fk_plano, String nome, String email, String senha, Date dt_nasc, int nivel, String imagem_url, int pontos, Date dt_criacao, String login, int fk_role_usuario) {
        this.id_usuario = id_usuario;
        this.fk_ranking = fk_ranking;
        this.fk_plano = fk_plano;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dt_nasc = dt_nasc;
        this.nivel = nivel;
        this.imagem_url = imagem_url;
        this.pontos = pontos;
        this.dt_criacao = dt_criacao;
        this.login = login;
        this.fk_role_usuario = fk_role_usuario;
    }
    //Construtor - Fim

    //Getters e Setters - Início
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getFk_ranking() {
        return fk_ranking;
    }

    public void setFk_ranking(int fk_ranking) {
        this.fk_ranking = fk_ranking;
    }

    public int getFk_plano() {
        return fk_plano;
    }

    public void setFk_plano(int fk_plano) {
        this.fk_plano = fk_plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getImagem_url() {
        return imagem_url;
    }

    public void setImagem_url(String imagem_url) {
        this.imagem_url = imagem_url;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Date getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(Date dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getFk_role_usuario() {
        return fk_role_usuario;
    }

    public void setFk_role_usuario(int fk_role_usuario) {
        this.fk_role_usuario = fk_role_usuario;
    }
    //Getters e Setters - Fim

    //toString - Início
    public String toString() {
        return "Nome: " + this.nome + "Senha: " + this.senha + "Email: " + this.email + "Data Nacimento: " + this.dt_nasc +
                "Level: " + this.nivel + "Url: " + this.imagem_url + "Pontos: " + this.pontos + "Data Abertura: " + this.dt_criacao +
                "Ranking: " + this.fk_ranking + "Id: " + this.id_usuario + "Id do plano: " + this.fk_plano+"login: "+this.login+"fk_role_usuario: "+this.fk_role_usuario;
    }//toString - Fim

}//Métodos e Classe - Fim
