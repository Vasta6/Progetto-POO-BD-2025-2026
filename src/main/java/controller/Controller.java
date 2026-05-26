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
    private ArrayList<Referto> listaReferti;
    private ArrayList<Reparto> listaReparti;

    public Controller() {
        this.listaPazienti = new ArrayList<>();
        this.listaCliniche = new ArrayList<>();
        this.listaPrenotazioni = new ArrayList<>();
        this.listaMedici = new ArrayList<>();
        this.listaReferti = new ArrayList<>();
        this.listaReparti = new ArrayList<>();

        //CLINICHE
        Clinica sanGennaro = new Clinica(01,java.time.LocalDate.of(1980,6,15),"Clinica San Gennaro","Via San Gennaro dei Poveri","Napoli","081 7733 456");
        this.listaCliniche.add(sanGennaro);

        Clinica ospedaleDellaPace = new Clinica(02,java.time.LocalDate.of(1993,1,22),"Ospedale Della Pace","Largo Resurrezione","Napoli","081 5490 182");
        this.listaCliniche.add(ospedaleDellaPace);

        Clinica rimettitiInMoto = new Clinica(03,java.time.LocalDate.of(2005,12,7),"Rimettiti In Moto","Via Vedano","Monza","039 4671 156");
        this.listaCliniche.add(rimettitiInMoto);

        //REPARTI
        Reparto prontoSoccorso = new Reparto(01,10,0,"Pronto Soccorso",sanGennaro);
        this.listaReparti.add(prontoSoccorso);

        Reparto oncologia = new Reparto(02,8,1,"Oncologia",sanGennaro);
        this.listaReparti.add(oncologia);

        Reparto neurologia = new Reparto(03,12,1,"Neurologia",ospedaleDellaPace);
        this.listaReparti.add(neurologia);

        Reparto pediatria = new Reparto(04,9,0,"Pediatria",ospedaleDellaPace);
        this.listaReparti.add(pediatria);

        Reparto fisioterapia = new Reparto(05,12,1,"Fisioterapia",rimettitiInMoto);
        this.listaReparti.add(fisioterapia);

        Reparto radiologia = new Reparto(06,10,2,"Radiologia",rimettitiInMoto);
        this.listaReparti.add(radiologia);

        //PRIMARI
        Medico di0s = new Medico("Diego Armando","Maradona","MRDDGR60R30Z600P","M010",java.time.LocalDate.of(1984,7,5),
                10000.00,prontoSoccorso,true,40,"0010","Chirurgia",null);
        this.listaMedici.add(di0s);

        Medico pelè = new Medico("Pelè", "do Nascimiento", "PLEDNS82M10F602E", "M011", java.time.LocalDate.of(1990,5,12),
                8500.00, oncologia, true, 40,"0011", "Ematologia", null);
        listaMedici.add(pelè);

        Medico messi = new Medico("Lionel", "Messi", "LNLMSS10M30B600P", "M100", java.time.LocalDate.of(2004,10,16),
                10500.00, neurologia, true, 40,"1010", "Neuroimmunologia", null);
        listaMedici.add(messi);

        Medico ronaldo = new Medico("Cristiano", "Ronaldo", "CRSRNL17M07R129A", "M007", java.time.LocalDate.of(2002,8,14),
                7500.00, pediatria, true, 40,"1007", "Pneumologia Pediatrica", null);
        listaMedici.add(ronaldo);

        Medico valeRossi = new Medico("Valentino", "Rossi", "RSSVLN79M46L500R", "M046", java.time.LocalDate.of(1996,3,31),
                7500.00, fisioterapia, true, 40,"2046", "Riabilitazione Ortopedica", null);
        listaMedici.add(valeRossi);

        Medico hamilton = new Medico("Lewis", "Hamilton", "HMLLWS85M44Z114H", "M044", java.time.LocalDate.of(2007,3,18),
                8000.00, radiologia, true, 40,"2044", "Radiologia Muscolo-Scheletrica", null);
        listaMedici.add(hamilton);

        //MEDICI
        //DIOS PRIMARIO
        Medico marioRossi = new Medico("Mario", "Rossi", "RSSMRA80A01F839X", "M001", java.time.LocalDate.of(2018,4,30),
                2500.00, prontoSoccorso,false,36,"0001","Chirurgia", di0s);
        this.listaMedici.add(marioRossi);

        Medico francesco = new Medico("Francesco", "Vastarella", "VSTFNC03D30F839C", "M002", java.time.LocalDate.of(2025,9,15),
                2500.00, prontoSoccorso,false,30,"0002","Traumatologia", di0s);
        this.listaMedici.add(francesco);

        //PELE PRIMARIO
        Medico neymar = new Medico("Neynar", "Da Silva", "SLVNMR92M11Z602H", "M003", java.time.LocalDate.of(2013,8,18),
                3000.00,oncologia,false,34,"0003","Terapie Oncologiche", pelè);
        this.listaMedici.add(neymar);

        Medico dinho = new Medico("Ronaldinho", "Gaucho", "GCHRND10M80G602H", "M004", java.time.LocalDate.of(2003,9,3),
                3500.00, oncologia,false,40,"0004","Anatomia Patologica", pelè);
        this.listaMedici.add(dinho);

        //MESSI PRIMARIO
        Medico emanuele = new Medico("Emanuele", "Niola", "NLIMNL06M31A024D", "M005", java.time.LocalDate.of(2025,9,3),
                2750.00, neurologia,false,36,"1005","Malattie Genetiche", messi);
        this.listaMedici.add(emanuele);

        Medico nicoPaz = new Medico("Nico", "Paz", "NCPZA79M18T600A", "M006", java.time.LocalDate.of(2023,11,8),
                2000.00, neurologia,false,38,"1006","Medicina Preventiva", messi);
        this.listaMedici.add(nicoPaz);

        //RONALDO
        Medico mbappè = new Medico("Kylian", "Mbappè", "MBPKLN09M71L110D", "M009", java.time.LocalDate.of(2015,12,2),
                3000.00, pediatria,false,32,"1008","Adolescentologia", ronaldo);
        this.listaMedici.add(mbappè);

        Medico rashford = new Medico("Marcus", "Rashford", "RSHT14M17A114K", "M014", java.time.LocalDate.of(2016,2,25),
                3500.00, pediatria,false,36,"1014","Malattie infettive pediatriche", ronaldo);
        this.listaMedici.add(rashford);

        //VALENTINO ROSSI PRIMARIO
        Medico mariano = new Medico("Mariano", "Russo", "RSSMNR06M71F839H", "M071", java.time.LocalDate.of(2025,1,30),
                2200.00, fisioterapia,false,40,"2023","Fisiatra", valeRossi);
        this.listaMedici.add(mariano);

        Medico angelica = new Medico("Angelica", "Casolaro", "CSLNGL45F69F839G", "M084", java.time.LocalDate.of(2016,6,20),
                2200.00, fisioterapia,false,35,"2020","Terapia del dolore", valeRossi);
        this.listaMedici.add(angelica);

        //HAMILTON PRIMARIO
        Medico charles  = new Medico("Charles", "Leclerc", "LCLCHL97M16Z124T", "M016", java.time.LocalDate.of(2018,3,25),
                2750.00, radiologia,false,31,"2016","Senologia", hamilton);
        this.listaMedici.add(charles);

        Medico schumacher = new Medico("Michael", "Schumacher", "SCHMCH69M03Z112W", "M077", java.time.LocalDate.of(2018,4,30),
                4000.00, radiologia,false,40,"2077","Radiologia Interventistica", hamilton);
        this.listaMedici.add(schumacher);
    }
    public void registraReferto(Referto r, Paziente p) {
        p.aggiungiReferto(r);
    }

    public ArrayList<Paziente> getListaPazienti() {
        return this.listaPazienti;
    }

    public ArrayList<Medico> getListaMedici() {
        return this.listaMedici;
    }

    public ArrayList<Prenotazione> getListaPrenotazioni() {
        return this.listaPrenotazioni;
    }

    public ArrayList<Referto> getListaReferti() {
        return listaReferti;
    }

    public ArrayList<Clinica> getListaCliniche() {
        return listaCliniche;
    }
    public ArrayList<Reparto> getListaReparto() {
        return listaReparti;
    }

    public void registraNuovoPaziente(Paziente p) {
        listaPazienti.add(p);
    }


    public void registraNuovaPrenotazione(Prenotazione p) {
        listaPrenotazioni.add(p);
    }


    public void aggiungiNuovoReferto(Referto r) {
        listaReferti.add(r);
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

    /*
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

    /*
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
