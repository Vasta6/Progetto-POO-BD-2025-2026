package Model;

import java.time.LocalDate;

public class Dipendente {
    private String nome, cognome,  codiceFiscale,matricola;
    private LocalDate dataAssunzione;
    private double stipendio;
    Reparto repartoDiAppartenenza;

    public Dipendente(String nome, String cognome, String codiceFiscale, String matricola, LocalDate dataAssunzione, double stipendio, Reparto repartoDiAppartenenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
        this.dataAssunzione = dataAssunzione;
        this.stipendio = stipendio;
        this.repartoDiAppartenenza = repartoDiAppartenenza;
    }

    public Reparto getRepartoDiAppartenenza() {
        return repartoDiAppartenenza;
    }

    public void setRepartoDiAppartenenza(Reparto repartoDiAppartenenza) {
        this.repartoDiAppartenenza = repartoDiAppartenenza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
}
