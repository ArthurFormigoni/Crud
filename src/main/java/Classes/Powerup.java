package Classes;

public class Powerup {
    private String nome;
    private int quantidade;
    private String store_picture_url;
    private int id_powerup;
    private String initial_time;
    private String durucao;
    private String final_time;
    private int fk_id_pagamento_coins;

    public Powerup(String nome, int quantidade, String store_picture_url, int id_powerup, String initial_time, String durucao, String final_time, int fk_id_pagamento_coins) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.store_picture_url = store_picture_url;
        this.id_powerup = id_powerup;
        this.initial_time = initial_time;
        this.durucao = durucao;
        this.final_time = final_time;
        this.fk_id_pagamento_coins = fk_id_pagamento_coins;
    }

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

    public String getStore_picture_url() {
        return store_picture_url;
    }

    public void setStore_picture_url(String store_picture_url) {
        this.store_picture_url = store_picture_url;
    }

    public int getId_powerup() {
        return id_powerup;
    }

    public void setId_powerup(int id_powerup) {
        this.id_powerup = id_powerup;
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

    public int getFk_id_pagamento_coins() {
        return fk_id_pagamento_coins;
    }

    public void setFk_id_pagamento_coins(int fk_id_pagamento_coins) {
        this.fk_id_pagamento_coins = fk_id_pagamento_coins;
    }


    @Override
    public String toString() {
        return "Nome: " +this.nome+
                "\nQuantidade: "+this.quantidade+
                "\nStore_picutere_url: " +this.store_picture_url+
                "\nId_powerup: "+this.id_powerup+
                "\nInitial_time: "+this.initial_time+
                "\nDuração"+this.durucao+
                "\nFinal_time: "+this.final_time+
                "\nFk_id_pagamento_coin: "+this.fk_id_pagamento_coins;
    }

}
