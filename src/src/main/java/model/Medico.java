package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Dipendente {
    private int oreSettimanaliAssegnate;
    private String numeroAlbo, specializzazione;
    private Medico primario;
    private boolean isPrimario;


    public Medico(String nome, String cognome, String codiceFiscale, String matricola, LocalDate dataAssunzione, double stipendio, Reparto repartoDiAppartenenza, boolean isPrimario, int oreSettimanaliAssegnate, String numeroAlbo, String specializzazione, Medico primario) {
        super(nome, cognome, codiceFiscale, matricola, dataAssunzione, stipendio, repartoDiAppartenenza);
        this.isPrimario = isPrimario;
        this.oreSettimanaliAssegnate = oreSettimanaliAssegnate;
        this.numeroAlbo = numeroAlbo;
        this.specializzazione = specializzazione;
        this.primario = primario;
    }

    public boolean getIdPrimario() {
        return isPrimario;
    }

    public void setIdPrimario(boolean isPrimario) {
        this.isPrimario = isPrimario;
    }

    public int getOreSettimanaliAssegnate() {
        return oreSettimanaliAssegnate;
    }

    public void setOreSettimanaliAssegnate(int oreSettimanaliAssegnate) {
        this.oreSettimanaliAssegnate = oreSettimanaliAssegnate;
    }

    public String getNumeroAlbo() {
        return numeroAlbo;
    }

    public void setNumeroAlbo(String numeroAlbo) {
        this.numeroAlbo = numeroAlbo;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public Medico getPrimario() {
        return primario;
    }

    public void setPrimario(Medico primario) {
        this.primario = primario;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + specializzazione;
    }
}
