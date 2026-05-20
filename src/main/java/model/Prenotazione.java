package Model;

import java.time.LocalDate;

public class Prenotazione
{
    private int idPrenotazione;
    private LocalDate dataOraInizio, dataOraFine;
    private String stato;

    Paziente paziente;
    Medico medicoRichiesto;
    Clinica clinicaRichiesta;

    public Prenotazione(int idPrenotazione, LocalDate dataOraInizio, LocalDate dataOraFine, String stato, Paziente paziente, Medico medicoRichiesto, Clinica clinicaRichiesta) {
        this.idPrenotazione = idPrenotazione;
        this.dataOraInizio = dataOraInizio;
        this.dataOraFine = dataOraFine;
        this.stato = stato;
        this.paziente = paziente;
        this.medicoRichiesto = medicoRichiesto;
        this.clinicaRichiesta = clinicaRichiesta;
    }

    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public LocalDate getDataOraInizio() {
        return dataOraInizio;
    }

    public void setDataOraInizio(LocalDate dataOraInizio) {
        this.dataOraInizio = dataOraInizio;
    }

    public LocalDate getDataOraFine() {
        return dataOraFine;
    }

    public void setDataOraFine(LocalDate dataOraFine) {
        this.dataOraFine = dataOraFine;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
