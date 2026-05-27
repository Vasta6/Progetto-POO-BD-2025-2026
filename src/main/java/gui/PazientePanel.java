package gui;

import controller.Controller;
import model.Paziente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PazientePanel extends JFrame {
    private JPanel pazientePanel;
    private JButton btnCartClin;
    private JButton btnPREN;
    private JLabel Titolopaz;

    private Controller controller;
    private Paziente paziente;

    public PazientePanel(Controller controller){

        this(controller,null);

    }

    public PazientePanel(Controller controller, Paziente paziente) {
        this.controller = controller;
        this.paziente = paziente;


        setVisible(true);
        setContentPane(pazientePanel);
        setTitle("Area Personale - Paziente");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnPREN.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //PASSARE AL CONTROLLER IL PROSSIMO FRAME
                PrenotazionePanel effettuaPrenotazione = new PrenotazionePanel(controller);
                effettuaPrenotazione.setVisible(true);
                //DISATTIVARE LA VISIBILITA
                dispose();
            }
        });


        btnCartClin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CartellaClinicaPanel cartellaClinica = new CartellaClinicaPanel(controller, paziente);
                cartellaClinica.setVisible(true);
                dispose();
            }
        });
    }
}
