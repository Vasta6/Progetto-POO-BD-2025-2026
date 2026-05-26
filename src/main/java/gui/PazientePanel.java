package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PazientePanel extends JFrame {
    private JPanel pazientePanel;
    private JButton btnCartClin;
    private JButton btnPREN;
    private JLabel Titolopaz;

    public PazientePanel(Controller controller){

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
    }
}
