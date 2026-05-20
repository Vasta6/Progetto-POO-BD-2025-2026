package Model;

public class Farmaco {
    private String codiceAIC, nomCommerciale, principioAttivo, obbligoRicetta;
    private double prezzo;
    Paziente pazienteRichiedente;

    public Farmaco(String codiceAIC, String nomCommerciale, String principioAttivo, String obbligoRicetta, double prezzo, Paziente pazienteRichiedente) {
        this.codiceAIC = codiceAIC;
        this.nomCommerciale = nomCommerciale;
        this.principioAttivo = principioAttivo;
        this.obbligoRicetta = obbligoRicetta;
        this.prezzo = prezzo;
        this.pazienteRichiedente = pazienteRichiedente;
    }

    public String getCodiceAIC() {
        return codiceAIC;
    }

    public void setCodiceAIC(String codiceAIC) {
        this.codiceAIC = codiceAIC;
    }

    public String getNomCommerciale() {
        return nomCommerciale;
    }

    public void setNomCommerciale(String nomCommerciale) {
        this.nomCommerciale = nomCommerciale;
    }

    public String getPrincipioAttivo() {
        return principioAttivo;
    }

    public void setPrincipioAttivo(String principioAttivo) {
        this.principioAttivo = principioAttivo;
    }

    public String getObbligoRicetta() {
        return obbligoRicetta;
    }

    public void setObbligoRicetta(String obbligoRicetta) {
        this.obbligoRicetta = obbligoRicetta;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
