package model;

import java.time.LocalDate;

public class Infermiere extends Dipendente {
    private String livello;
    private int oreSettimanali;

    public Infermiere(String nome, String cognome, String codiceFiscale, String matricola, LocalDate dataAssunzione, double stipendio, Reparto repartoDiAppartenenza, String livello, int oreSettimanali) {
        super(nome, cognome, codiceFiscale, matricola, dataAssunzione, stipendio, repartoDiAppartenenza);
        this.livello = livello;
        this.oreSettimanali = oreSettimanali;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public int getOreSettimanali() {
        return oreSettimanali;
    }

    public void setOreSettimanali(int oreSettimanali) {
        this.oreSettimanali = oreSettimanali;
    }
}
