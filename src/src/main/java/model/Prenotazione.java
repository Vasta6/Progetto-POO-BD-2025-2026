package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prenotazione
{
    private int idPrenotazione;
    private LocalDateTime dataOraInizio, dataOraFine;
    private String stato;

    Paziente paziente;
    Medico medicoRichiesto;
    Clinica clinicaRichiesta;

    public Prenotazione(int idPrenotazione, LocalDateTime dataOraInizio, LocalDateTime dataOraFine, String stato, Paziente paziente, Medico medicoRichiesto, Clinica clinicaRichiesta) {
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

    public LocalDateTime getDataOraInizio() {
        return dataOraInizio;
    }

    public void setDataOraInizio(LocalDateTime dataOraInizio) {
        this.dataOraInizio = dataOraInizio;
    }

    public LocalDateTime getDataOraFine() {
        return dataOraFine;
    }

    public void setDataOraFine(LocalDateTime dataOraFine) {
        this.dataOraFine = dataOraFine;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public Medico getMedicoRichiesto() {
        return medicoRichiesto;
    }

    public void setMedicoRichiesto(Medico medicoRichiesto) {
        this.medicoRichiesto = medicoRichiesto;
    }

    public Clinica getClinicaRichiesta() {
        return clinicaRichiesta;
    }

    public void setClinicaRichiesta(Clinica clinicaRichiesta) {
        this.clinicaRichiesta = clinicaRichiesta;
    }
}
