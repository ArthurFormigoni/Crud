package ClassesDAO;

public class Adm {
    String login;
    String senha;
    String nome;
    String data_nascimento;
    String imagem_url;
    String dt_criacao;
    String email;
    int id_adm;

    public Adm(String login, String senha, String nome, String data_nascimento, String imagem_url, String dt_criacao, String email, int id_adm) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.imagem_url = imagem_url;
        this.dt_criacao = dt_criacao;
        this.email = email;
        this.id_adm = id_adm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getImagem_url() {
        return imagem_url;
    }

    public void setImagem_url(String imagem_url) {
        this.imagem_url = imagem_url;
    }

    public String getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_adm() {
        return id_adm;
    }

    public void setId_adm(int id_adm) {
        this.id_adm = id_adm;
    }


    @Override
    public String toString() {
        return "Login: "+this.login+
                "\nSenha: "+this.senha+
                "Nome: "+this.nome+
                "Data_nascimento: "+ this.data_nascimento+
                "Imagem_url: "+this.imagem_url+
                "Dt_criacao: "+this.dt_criacao+
                "Email: "+this.email+
                "Id_adm"+this.id_adm ;
    }
}
