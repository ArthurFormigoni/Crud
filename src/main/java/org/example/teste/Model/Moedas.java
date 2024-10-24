package org.example.teste.Model;

public class Moedas {
    private int quantidade;
    private int id_moedas;
    private int fk_usuario;
    private int fk_pagamento;

    public Moedas(){}
    public Moedas(int quantidade, int id_moedas, int fk_usuario, int fk_pagamento){
        this.quantidade = quantidade;
        this.id_moedas = id_moedas;
        this.fk_usuario = fk_usuario;
        this.fk_pagamento = fk_pagamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId_moedas() {
        return id_moedas;
    }

    public void setId_moedas(int id_moedas) {
        this.id_moedas = id_moedas;
    }

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public int getFk_pagamento() {
        return fk_pagamento;
    }

    public void setFk_pagamento(int fk_pagamento) {
        this.fk_pagamento = fk_pagamento;
    }
    @Override
    public String toString() {
        return "Coins{" +
                "quantidade=" + quantidade +
                ", id_moedas=" + id_moedas +
                ", fk_usuario=" + fk_usuario +
                ", fk_pagamento=" + fk_pagamento +
                '}';
    }



}
