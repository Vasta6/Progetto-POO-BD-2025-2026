package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Referto {
    private int idReferto;
    private LocalDate dataCompilazione;
    private String sintomiDichiarati, diagnosi, noteAggiuntive;
    private ArrayList<Prescrizione> prescrizioni;
    Prenotazione prenotazioneCollegata;

    public Referto(int idReferto, LocalDate dataCompilazione, String sintomiDichiarati, String diagnosi, String noteAggiuntive, ArrayList<Prescrizione> prescrizioni, Prenotazione prenotazioneCollegata) {
        this.idReferto = idReferto;
        this.dataCompilazione = dataCompilazione;
        this.sintomiDichiarati = sintomiDichiarati;
        this.diagnosi = diagnosi;
        this.noteAggiuntive = noteAggiuntive;
        this.prescrizioni = new ArrayList<>();
        this.prenotazioneCollegata = prenotazioneCollegata;
    }

    public int getIdReferto() {
        return idReferto;
    }

    public void setIdReferto(int idReferto) {
        this.idReferto = idReferto;
    }

    public LocalDate getDataCompilazione() {
        return dataCompilazione;
    }

    public void setDataCompilazione(LocalDate dataCompilazione) {
        this.dataCompilazione = dataCompilazione;
    }

    public String getSintomiDichiarati() {
        return sintomiDichiarati;
    }

    public void setSintomiDichiarati(String sintomiDichiarati) {
        this.sintomiDichiarati = sintomiDichiarati;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    public String getNoteAggiuntive() {
        return noteAggiuntive;
    }

    public void setNoteAggiuntive(String noteAggiuntive) {
        this.noteAggiuntive = noteAggiuntive;
    }

    public ArrayList<Prescrizione> getPrescrizioni() {
        return prescrizioni;
    }

    public void setPrescrizioni(ArrayList<Prescrizione> prescrizioni) {
        this.prescrizioni = prescrizioni;
    }

    public void aggiungiPrescrizione (Prescrizione p) {
        this.prescrizioni.add(p);
    }
}
