package Model;

import java.util.ArrayList;

public class Allergia {
    private int id_Allergia;
    private String principioAttivo;
    ArrayList<Paziente>pazientiallergici;

    public Allergia(int id_Allergia, String principioAttivo, ArrayList<Paziente> pazientiallergici) {
        this.id_Allergia = id_Allergia;
        this.principioAttivo = principioAttivo;
        this.pazientiallergici = pazientiallergici;
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
        pazientiallergici.add(p);
    }
}
