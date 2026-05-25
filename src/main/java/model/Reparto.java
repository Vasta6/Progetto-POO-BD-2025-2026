package model;

import java.util.ArrayList;

public class Reparto {
    private int idReparto, numeroStanze, piano;
    private String nomeReparto;
    Clinica clinicaDiAppartenenza;

    public Reparto(int idReparto, int numeroStanze, int piano, String nomeReparto, Clinica clinicaDiAppartenenza) {
        this.idReparto = idReparto;
        this.numeroStanze = numeroStanze;
        this.piano = piano;
        this.nomeReparto = nomeReparto;
        this.clinicaDiAppartenenza = clinicaDiAppartenenza;
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

    public Clinica getClinicaDiAppartenenza() {
        return clinicaDiAppartenenza;
    }

    public void setClinicaDiAppartenenza(Clinica clinicaDiAppartenenza) {
        this.clinicaDiAppartenenza = clinicaDiAppartenenza;
    }
}
