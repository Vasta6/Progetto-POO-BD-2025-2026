package gui;

import model.*;
import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RefertoPanel extends JFrame {
    private JPanel erogaReferto;
    private JTextField dataCompilazione;
    private JTextField idReferto;
    private JTextArea sintomiDichiarati;
    private JTextArea diagnosi;
    private JTextArea noteAggiuntive;
    private JButton erogazioneREF;


    /* public RefertoPanel(Controller controller) {

         setVisible(true);
         setContentPane(erogaReferto);
         setTitle("Compila il Referto");
         setSize(400,300);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);


         erogazioneREF.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int idIntero = Integer.parseInt(idReferto.getText());
                 LocalDate dataReferto = LocalDate.now();
                 String sintomi = sintomiDichiarati.getText();
                 String diagnosis = diagnosi.getText();
                 String note = noteAggiuntive.getText();
                 controller.aggiungiNuovoReferto(new Referto(idIntero, dataReferto, sintomi, diagnosis, note,null, null));
             }
         });
     }
 }*/
    public RefertoPanel(Controller controller) {

        // 1. Setup della finestra
        setContentPane(erogaReferto);
        setTitle("Compila il Referto");
        setSize(400, 450); // Ti consiglio di alzarlo un po' per far entrare bene i 3 box di testo
        setLocationRelativeTo(null);

        // ⚠️ ATTENZIONE: Se usi EXIT_ON_CLOSE, chiudendo questo referto si chiuderà TUTTA l'applicazione!
        // Usa DISPOSE_ON_CLOSE così si chiude solo questa finestrella e il medico torna alla schermata principale.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 🛑 ECCO IL CODICE MAGICO PER LA DATA AUTOMATICA
        dataCompilazione.setText(LocalDate.now().toString());

        // Ti consiglio anche di bloccarla, così il medico non può cancellarla o scriverla in formati strani
        dataCompilazione.setEditable(false);

        // Azione del bottone
        erogazioneREF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idIntero = Integer.parseInt(idReferto.getText());
                LocalDate dataReferto = LocalDate.now();
                String sintomi = sintomiDichiarati.getText();
                String diagnosis = diagnosi.getText();
                String note = noteAggiuntive.getText();

                // Qui andrai a passargli anche il paziente come discusso prima ;)
                controller.aggiungiNuovoReferto(new Referto(idIntero, dataReferto, sintomi, diagnosis, note, null, null));

                JOptionPane.showMessageDialog(null, "Referto salvato!");
                dispose(); // Chiude la finestra del referto dopo aver salvato
            }
        });

        // 2. Rendi visibile la finestra SOLO alla fine, dopo aver caricato la data
        setVisible(true);
    }
}