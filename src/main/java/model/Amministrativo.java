package Model;

import java.time.LocalDate;

public class Amministrativo extends Dipendente {
    private String ruoloUfficio;

    public Amministrativo(String nome, String cognome, String codiceFiscale, String matricola, LocalDate dataAssunzione, double stipendio, Reparto repartoDiAppartenenza, String ruoloUfficio) {
        super(nome, cognome, codiceFiscale, matricola, dataAssunzione, stipendio, repartoDiAppartenenza);
        this.ruoloUfficio = ruoloUfficio;
    }

    public String getRuoloUfficio() {
        return ruoloUfficio;
    }

    public void setRuoloUfficio(String ruoloUfficio) {
        this.ruoloUfficio = ruoloUfficio;
    }
}
