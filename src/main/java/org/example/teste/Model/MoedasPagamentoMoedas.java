package org.example.teste.Model;

public class MoedasPagamentoMoedas {
    //Atributos - Início
    private int id_moedas_pagamento_moedas;
    private int fk_moedas;
    private int fk_pagamento_moedas;
 // Atributos - Fim
    public MoedasPagamentoMoedas(int id_moedas_pagamento_moedas, int fk_moedas, int fk_pagamento_moedas){
        this.id_moedas_pagamento_moedas = id_moedas_pagamento_moedas;
        this.fk_moedas = fk_moedas;
        this.fk_pagamento_moedas = fk_pagamento_moedas;
    }

    public int getId_moedas_pagamento_moedas() {
        return id_moedas_pagamento_moedas;
    }

    public void setId_moedas_pagamento_moedas(int id_moedas_pagamento_moedas) {
        this.id_moedas_pagamento_moedas = id_moedas_pagamento_moedas;
    }

    public int getFk_moedas() {
        return fk_moedas;
    }

    public void setFk_moedas(int fk_moedas) {
        this.fk_moedas = fk_moedas;
    }

    public int getFk_pagamento_moedas() {
        return fk_pagamento_moedas;
    }

    public void setFk_pagamento_moedas(int fk_pagamento_moedas) {
        this.fk_pagamento_moedas = fk_pagamento_moedas;
    }
    @Override
    public String toString() {
        return "Moedas_Pagamento_moedas{" +
                "id_moedas_pagamento_moedas=" + id_moedas_pagamento_moedas +
                ", fk_moedas=" + fk_moedas +
                ", fk_pagamento_moedas=" + fk_pagamento_moedas +
                '}';
    }

}
