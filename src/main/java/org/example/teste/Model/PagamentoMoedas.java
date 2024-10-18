package org.example.teste.Model;

import java.sql.Timestamp;

public class PagamentoMoedas {
    private int id_pagamento_moedas;
    private Timestamp dt_inicial;
    private Timestamp dt_expirado;
    private int fk_usuario;

    public PagamentoMoedas(int id_pagamento_moedas, Timestamp dt_inicial, Timestamp dt_expirado, int fk_usuario) {
        this.id_pagamento_moedas = id_pagamento_moedas;
        this.dt_inicial = dt_inicial;
        this.dt_expirado = dt_expirado;
        this.fk_usuario = fk_usuario;
    }

    public int getId_pagamento_moedas() {
        return id_pagamento_moedas;
    }

    public void setId_pagamento_moedas(int id_pagamento_moedas) {
        this.id_pagamento_moedas = id_pagamento_moedas;
    }

    public Timestamp getDt_inicial() {
        return dt_inicial;
    }

    public void setDt_inicial(Timestamp dt_inicial) {
        this.dt_inicial = dt_inicial;
    }

    public Timestamp getDt_expirado() {
        return dt_expirado;
    }

    public void setDt_expirado(Timestamp dt_expirado) {
        this.dt_expirado = dt_expirado;
    }

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    @Override
    public String toString() {
        return "Pagamento_moedas{" +
                "id_pagamento_moedas=" + id_pagamento_moedas +
                ", dt_inicial=" + dt_inicial +
                ", dt_expirado=" + dt_expirado +
                ", fk_usuario=" + fk_usuario +
                '}';
    }
}
