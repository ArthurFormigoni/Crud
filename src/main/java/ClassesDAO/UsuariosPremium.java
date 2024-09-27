package ClassesDAO;

public class UsuariosPremium {
    private String nome;
    private String senha;
    private String email;
    private String dt_nasc;
    private int level;
    private String picture_url;
    private int pontos;
    private String dt_criacao;
    private int fk_id_ranking;
    private int id_usuario;
    private int fk_id_plano;

    public UsuariosPremium(String nome, String senha, String email, String dt_nasc, int level, String picture_url, int pontos, String dt_criacao, int fk_id_ranking, int id_usuario, int fk_id_plano) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.dt_nasc = dt_nasc;
        this.level = level;
        this.picture_url = picture_url;
        this.pontos = pontos;
        this.dt_criacao = dt_criacao;
        this.fk_id_ranking = fk_id_ranking;
        this.id_usuario = id_usuario;
        this.fk_id_plano = fk_id_plano;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDt_nasc() {
        return dt_nasc;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getPicture_url() {
        return picture_url;
    }
    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public String getDt_criacao() {
        return dt_criacao;
    }
    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }
    public int getFk_id_ranking() {
        return fk_id_ranking;
    }
    public void setFk_id_ranking(int fk_id_ranking) {
        this.fk_id_ranking = fk_id_ranking;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public int getFk_id_plano() {
        return fk_id_plano;
    }
    public void setFk_id_plano(int fk_id_plano) {
        this.fk_id_plano = fk_id_plano;
    }

    public String toString() {
        return "Nome: " + this.nome + "Senha: " + this.senha + "Email: " + this.email + "Data Nacimento: " + this.dt_nasc +
                "Level: " + this.level + "Url: " + this.picture_url + "Pontos: " + this.pontos + "Data Abertura: " + this.dt_criacao +
                "Ranking: " + this.fk_id_ranking + "Id: " + this.id_usuario + "Id do plano: " + this.fk_id_plano;
    }
}