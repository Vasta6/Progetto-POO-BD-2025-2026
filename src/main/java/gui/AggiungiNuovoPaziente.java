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
    private JTextArea Nota;

    public AggiungiNuovoPaziente(Controller controller) {
        setContentPane(registrazionePaziente);
        setTitle("Registrazione Paziente ");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        Allergia[] elencoAllergie = {
                new Allergia(0, "Acido Acetilsalicilico"),
                new Allergia(1, "Penicillina"),
                new Allergia(2, "Cortisone"),
                new Allergia(3, "Sufamidici"),
                new Allergia(4, "Ibuprofene"),

        };

        listaAllergie.setListData(elencoAllergie);

        listaAllergie.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnRegistrazioneCompleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = nomePaziente.getText().trim();
                String cognome = cognomePaziente.getText().trim();
                String codiceFISCALE = codiceFiscale.getText().trim();
                String numTel = numeroTelefono.getText().trim();
                String postaELETTR = mail.getText().trim();
                String dataStringa = dataDiNascita.getText().trim();

                // Controllo campi vuoti
                if (nome.isEmpty() || cognome.isEmpty() || codiceFISCALE.isEmpty() || dataStringa.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tutti i campi principali sono obbligatori!", "Errore", JOptionPane.WARNING_MESSAGE);
                    return; // Ferma l'esecuzione se manca qualcosa
                }
                java.util.List<Allergia> allergieSelezionate = listaAllergie.getSelectedValuesList();
                ArrayList<Allergia> allergiePaziente = new ArrayList<>(allergieSelezionate);
                //Il try-catch per proteggere la data di nascita
                try {
                    // Converte il testo in LocalDate (formato richiesto: AAAA-MM-GG)
                    LocalDate dataNascita = LocalDate.parse(dataStringa);

                    // Se la data è corretta, registriamo il paziente nel controller
                    controller.registraNuovoPaziente(new Paziente(nome, cognome, codiceFISCALE, numTel, postaELETTR, dataNascita,allergiePaziente));

                    JOptionPane.showMessageDialog(null, "Paziente registrato con successo!");

                    // Torniamo alla Home chiudiamo il pannello
                    Home logInGUI = new Home(controller);
                    logInGUI.setVisible(true);
                    dispose();

                } catch (DateTimeParseException ex) {
                    // Se la data è vuota o scritta male, mostriamo l'errore
                    JOptionPane.showMessageDialog(null, "Formato data non valido! Usa: ANNO-MESE-GIORNO (Es: 1998-12-20)", "Errore Data", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}