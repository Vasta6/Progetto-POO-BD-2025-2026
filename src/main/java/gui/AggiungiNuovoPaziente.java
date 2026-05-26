package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import model.*;

public class AggiungiNuovoPaziente extends JFrame {


    private JTextField nomePaziente;
    private JTextField cognomePaziente;
    private JTextField codiceFiscale;
    private JTextField numeroTelefono;
    private JTextField mail;
    private JTextField dataDiNascita;
    private JLabel nomeLabel;
    private JLabel cognomeLabel;
    private JLabel codiceFiscaleLabel;
    private JLabel numTelLabel;
    private JLabel datNascLabel;
    private JLabel allergieLabel;
    private JPanel registrazionePaziente;
    private JButton btnRegistrazioneCompleta;
    private JList listaAllergie;
    private JScrollPane scorrimentoAllergie;

    public AggiungiNuovoPaziente(Controller controller) {
        // 1. Setup iniziale della finestra (va bene lasciarlo in alto)
        setContentPane(registrazionePaziente);
        setTitle("Area Personale");
        setSize(550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Rendi visibile il frame solo DOPO aver configurato i componenti
        setVisible(true);

        Allergia[] elencoAllergie = {
                new Allergia(0, "Acido Acetilsalicilico"),
                new Allergia(1, "Penicillina"),
                new Allergia(2, "Cortisone"),
                new Allergia(3, "Sufamidici"),
                new Allergia(4, "Ibuprofene"),

        };

        // 2. Passiamo l'array alla JList
        listaAllergie.setListData(elencoAllergie);

        // 3. ABILITIAMO LA SELEZIONE MULTIPLA
        listaAllergie.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // 2. AZIONE DEL BOTTONE: Tutto accade quando l'utente clicca!
        btnRegistrazioneCompleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                // LEGGIAMO I DATI SOLO ORA CHE IL BOTTONE È STATO PREMUTO
                String nome = nomePaziente.getText().trim();
                String cognome = cognomePaziente.getText().trim();
                String codiceFISCALE = codiceFiscale.getText().trim();
                String numTel = numeroTelefono.getText().trim();
                String postaELETTR = mail.getText().trim();
                String dataStringa = dataDiNascita.getText().trim();

                // Controllo campi vuoti per evitare crash
                if (nome.isEmpty() || cognome.isEmpty() || codiceFISCALE.isEmpty() || dataStringa.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tutti i campi principali sono obbligatori!", "Errore", JOptionPane.WARNING_MESSAGE);
                    return; // Ferma l'esecuzione se manca qualcosa
                }
                java.util.List<Allergia> allergieSelezionate = listaAllergie.getSelectedValuesList();
                ArrayList<Allergia> allergiePaziente = new ArrayList<>(allergieSelezionate);
                // IL TRY-CATCH PER PROTEGGERE LA DATA DI NASCITA
                try {
                    // Converte il testo in LocalDate (formato richiesto: AAAA-MM-GG)
                    LocalDate dataNascita = LocalDate.parse(dataStringa);

                    // Se la data è corretta, registriamo il paziente nel controller
                    controller.registraNuovoPaziente(new Paziente(nome, cognome, codiceFISCALE, numTel, postaELETTR, dataNascita,allergiePaziente));

                    JOptionPane.showMessageDialog(null, "Paziente registrato con successo!");

                    // Torniamo alla Home di Login e chiudiamo questo pannello
                    Home logInGUI = new Home(controller);
                    logInGUI.setVisible(true);
                    dispose();

                } catch (DateTimeParseException ex) {
                    // Se la data è vuota o scritta male (es. con i /), mostriamo l'errore senza crashare
                    JOptionPane.showMessageDialog(null, "Formato data non valido! Usa: ANNO-MESE-GIORNO (Es: 1998-12-20)", "Errore Data", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}