package model;

public class Prescrizione {
    private int durataTerapiaGiorni;
    private String dosaggioGiornaliero;
    Referto refertoVisita;
    Farmaco farmacoPrescritto;

    public Prescrizione(int durataTerapiaGiorni, String dosaggioGiornaliero, Referto refertoVisita, Farmaco farmacoPrescritto) {
        this.durataTerapiaGiorni = durataTerapiaGiorni;
        this.dosaggioGiornaliero = dosaggioGiornaliero;
        this.refertoVisita = refertoVisita;
        this.farmacoPrescritto = farmacoPrescritto;
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
