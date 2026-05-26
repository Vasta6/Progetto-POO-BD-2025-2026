package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
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
    private JTextArea allergie;
    private JLabel allergieLabel;
    private JPanel registrazionePaziente;
    private JButton btnRegistrazioneCompleta;

    public AggiungiNuovoPaziente(Controller controller) {

        setVisible(true);
        setContentPane(registrazionePaziente);
        setTitle("Area Personale");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String nome =  nomePaziente.getText();
        String cognome = cognomePaziente.getText();
        String codiceFISCALE = codiceFiscale.getText();
        String numTel = numeroTelefono.getText();
        String postaELETTR = mail.getText();
        LocalDate dataNascita = LocalDate.parse(dataDiNascita.getText());
        String allergies =  allergie.getText();

        controller.registraNuovoPaziente(new Paziente (nome, cognome, codiceFISCALE, numTel,postaELETTR,dataNascita));


        btnRegistrazioneCompleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Home logInGUI = new Home(controller);
                logInGUI.setVisible(true);
                dispose();
            }
        });
    }


}
