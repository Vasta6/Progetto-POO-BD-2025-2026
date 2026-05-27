package model;

import java.util.ArrayList;

public class Allergia {
    private int id_Allergia;
    private String principioAttivo;
    ArrayList<Paziente>pazientiAllergici;

    public Allergia(int id_Allergia, String principioAttivo) {
        this.id_Allergia = id_Allergia;
        this.principioAttivo = principioAttivo;
        this.pazientiAllergici = new ArrayList<>();
    }

    public int getId_Allergia() {
        return id_Allergia;
    }

    public void setId_Allergia(int id_Allergia) {
        this.id_Allergia = id_Allergia;
    }

    public String getPrincipioAttivo() {
        return principioAttivo;
    }

    public void setPrincipioAttivo(String principioAttivo) {
        this.principioAttivo = principioAttivo;
    }
    public void addPaziente(Paziente p){
        pazientiAllergici.add(p);
    }

    public ArrayList<Paziente> getPazientiAllergici() {
        return pazientiAllergici;
    }

    public void setPazientiAllergici(ArrayList<Paziente> pazientiAllergici) {
        this.pazientiAllergici = pazientiAllergici;
    }
    @Override
    public String toString() {
        return this.principioAttivo;
    }
}

