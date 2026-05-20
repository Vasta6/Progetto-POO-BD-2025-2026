package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clinica {
    private int idClinica;
    private LocalDate dataCreazione;
    private String nome, indirizzo, città, numeroTelefonico;
    ArrayList<Reparto> reparti;

    public Clinica(int idClinica, LocalDate dataCreazione, String nome, String indirizzo, String città, String numeroTelefonico, ArrayList<Reparto> reparti) {
        this.idClinica = idClinica;
        this.dataCreazione = dataCreazione;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.città = città;
        this.numeroTelefonico = numeroTelefonico;
        this.reparti = reparti;
    }

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(LocalDate dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public void addreparti(Reparto r){
        reparti.add(r);
    }
}
