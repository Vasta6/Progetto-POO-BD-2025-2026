package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Dipendente {
    private int idPrimario, oreSettimanaliAssegnate;
    private String numeroAlbo, specializzazione;
    Reparto repartoAssegnato;
    private ArrayList<Medico> primario;


    public Medico(String nome, String cognome, String codiceFiscale, String matricola, LocalDate dataAssunzione, double stipendio, Reparto repartoDiAppartenenza, int idPrimario, int oreSettimanaliAssegnate, String numeroAlbo, String specializzazione, Reparto repartoAssegnato, ArrayList<Medico> primario) {
        super(nome, cognome, codiceFiscale, matricola, dataAssunzione, stipendio, repartoDiAppartenenza);
        this.idPrimario = idPrimario;
        this.oreSettimanaliAssegnate = oreSettimanaliAssegnate;
        this.numeroAlbo = numeroAlbo;
        this.specializzazione = specializzazione;
        this.repartoAssegnato = repartoAssegnato;
        this.primario = primario;
    }

    public int getIdPrimario() {
        return idPrimario;
    }

    public void setIdPrimario(int idPrimario) {
        this.idPrimario = idPrimario;
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

}
