package model;

public class Prescrizione {
    private int idPrescrizione, durataTerapiaGiorni;
    private String dosaggioGiornaliero;
    // ASSOCIAZIONI
    Referto refertoVisita;
    Farmaco farmacoPrescritto;

    public Prescrizione(int idPrescrizione, int durataTerapiaGiorni, String dosaggioGiornaliero, Referto refertoVisita, Farmaco farmacoPrescritto) {
        this.idPrescrizione = idPrescrizione;
        this.durataTerapiaGiorni = durataTerapiaGiorni;
        this.dosaggioGiornaliero = dosaggioGiornaliero;
        this.refertoVisita = refertoVisita;
        this.farmacoPrescritto = farmacoPrescritto;
    }

    public int getIdPrescrizione() {
        return idPrescrizione;
    }

    public void setIdPrescrizione(int idPrescrizione) {
        this.idPrescrizione = idPrescrizione;
    }

    public int getDurataTerapiaGiorni() {
        return durataTerapiaGiorni;
    }

    public void setDurataTerapiaGiorni(int durataTerapiaGiorni) {
        this.durataTerapiaGiorni = durataTerapiaGiorni;
    }

    public String getDosaggioGiornaliero() {
        return dosaggioGiornaliero;
    }

    public void setDosaggioGiornaliero(String dosaggioGiornaliero) {
        this.dosaggioGiornaliero = dosaggioGiornaliero;
    }

    public Referto getRefertoVisita() {
        return refertoVisita;
    }

    public void setRefertoVisita(Referto refertoVisita) {
        this.refertoVisita = refertoVisita;
    }

    public Farmaco getFarmacoPrescritto() {
        return farmacoPrescritto;
    }

    public void setFarmacoPrescritto(Farmaco farmacoPrescritto) {
        this.farmacoPrescritto = farmacoPrescritto;
    }
}
