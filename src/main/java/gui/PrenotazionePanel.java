package gui;

import controller.Controller;
import model.*;
import javax.swing.*;
import java.util.ArrayList;

public class PrenotazionePanel extends JFrame {
    private JPanel effettuaPrenotazione;
    private JComboBox sceltaClinica;
    private JComboBox sceltaReparto;
    private JComboBox sceltaMedico;
    private JComboBox sceltaGiorno;
    private JComboBox sceltaOra;
    private JButton btnPrenotazione;

    public PrenotazionePanel(Controller controller) {

        setVisible(true);
        setContentPane(effettuaPrenotazione);
        setTitle("Effettua Prenotazione");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        ArrayList<Clinica> cliniche = controller.getListaCliniche();
        for (Clinica c : cliniche) {
            sceltaClinica.addItem(c);
        }
        ArrayList<Reparto> reparti = controller.getListaReparto();
        for (Reparto r : reparti) {
            sceltaReparto.addItem(r);
        }
        ArrayList<Medico> medici = controller.getListaMedici();
        for (Medico m : medici) {
            sceltaMedico.addItem(m);
        }



    }
}
