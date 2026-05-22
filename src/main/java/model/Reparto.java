package model;

import java.util.ArrayList;

public class Reparto {
    private int idReparto, numeroStanze, piano;
    private String nomeReparto;
    ArrayList<Dipendente>dipendenti;

    public Reparto(int idReparto, int numeroStanze, int piano, String nomeReparto) {
        this.idReparto = idReparto;
        this.numeroStanze = numeroStanze;
        this.piano = piano;
        this.nomeReparto = nomeReparto;
        this.dipendenti = new ArrayList<>();
    }

    public int getIdReparto() {
        return idReparto;
    }

    public void setIdReparto(int idReparto) {
        this.idReparto = idReparto;
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public String getNomeReparto() {
        return nomeReparto;
    }

    public void setNomeReparto(String nomeReparto) {
        this.nomeReparto = nomeReparto;
    }
    public void addDipendenti(Dipendente d){
        dipendenti.add(d);
    }
}
