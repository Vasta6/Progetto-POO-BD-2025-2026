package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paziente {
    private String nome,cognome,codiceFiscale,telefono,email;
    private LocalDate dataNascita;
    private ArrayList<Allergia> allergie;

    public Paziente(String nome, String cognome, String codiceFiscale, String telefono, String email, LocalDate dataNascita, ArrayList<Allergia> allergie) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.telefono = telefono;
        this.email = email;
        this.dataNascita = dataNascita;
        this.allergie = allergie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
public void addAllergia(Allergia a){
    allergie.add(a);
    }

}
