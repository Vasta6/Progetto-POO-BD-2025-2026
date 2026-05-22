package controller;

import model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;



public class Controller {
    // "Database" temporaneo in memoria centralizzato
    private ArrayList<Paziente> listaPazienti;
    private ArrayList<Clinica> listaCliniche;
    private ArrayList<Prenotazione> listaPrenotazioni;
    private ArrayList<Medico> listaMedici;

    public Controller() {
        this.listaPazienti = new ArrayList<>();
        this.listaCliniche = new ArrayList<>();
        this.listaPrenotazioni = new ArrayList<>();
        this.listaMedici = new ArrayList<>();

    }

    public ArrayList<Paziente> getListaPazienti() {
        return this.listaPazienti;
    }

    public void registraNuovoPaziente(String nome, String cognome, String cf, String tel, String email, java.time.LocalDate nascita) {
        Paziente p = new Paziente(nome, cognome, cf, tel, email, nascita);
        listaPazienti.add(p);
    }

    public ArrayList<Medico> getListaMedici() {
        return this.listaMedici;
    }

    public void registraNuovoMedico(Medico m) {
        listaMedici.add(m);
    }

    public ArrayList<Prenotazione> getListaPrenotazioni() {
        return this.listaPrenotazioni;
    }

    /*
     * VINCOLO 1: Sicurezza del paziente - Blocco allergie
     * Controlla se il principio attivo del farmaco è tra le allergie del paziente;
     * Se è incompatibile blocca l'operazione immediatamente.   */

    public boolean emettiPrescrizioneSicura(Paziente paziente, Referto referto, Farmaco farmaco, int idPrescr, int durata, String dosaggio) {
        for (Allergia a : paziente.getAllergie()) {
            if (a.getPrincipioAttivo().equalsIgnoreCase(farmaco.getPrincipioAttivo())) {
                return false;
            }
        }
        // Se non è allergico, crea la prescrizione e la aggancia al referto
        Prescrizione nuova = new Prescrizione(idPrescr, durata, dosaggio, referto, farmaco);
        referto.aggiungiPrescrizione(nuova);
        return true;
    }

    /**
     * VINCOLO 2: Conflitti di schedulazione - Sovrapposizione Orari
     * Verifica che il medico non abbia altre visite che si sovrappongono nell'intervallo richiesto. */
    public boolean isMedicoDisponibile(Medico medico, LocalDateTime inizioRichiesto, LocalDateTime fineRichiesto) {
        for (Prenotazione p : listaPrenotazioni) {

            // Se la prenotazione appartiene al medico che stiamo controllando
            if (p.getMedicoRichiesto().getMatricola().equals(medico.getMatricola())) {
                // Algoritmo di controllo sovrapposizione temporale tra due intervalli
                if (inizioRichiesto.isBefore(p.getDataOraFine()) && fineRichiesto.isAfter(p.getDataOraInizio())) {
                    return false; // C'è una sovrapposizione di orario!
                }
            }
        }
        return true; // Medico libero
    }

    /**
     * VINCOLO 3: Sforamento Monte Ore Settimanale
     * Impedisce l'assegnazione se porta un medico o un infermiere a superare le 40 ore complessive.
     */
    public boolean verificaTettoOreMedico(Medico medico, int oreNuovaVisita_Turno) {
         int oreTotali= medico.getOreSettimanaliAssegnate()+ oreNuovaVisita_Turno;
         if(oreTotali<=40){
             return true;
         }else{
             return false;
         }
    }

    public boolean verificaTettoOreInfermiere(Infermiere infermiere, int oreNuovoTurno) {
        return (infermiere.getOreSettimanali() + oreNuovoTurno) <= 40;
    }

}
