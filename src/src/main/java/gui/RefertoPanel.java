package gui;

import model.*;
import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class RefertoPanel extends JFrame {
    private JPanel erogaReferto;
    private JTextField dataCompilazione;
    private JTextField idReferto;
    private JTextArea sintomiDichiarati;
    private JTextArea diagnosi;
    private JTextArea noteAggiuntive;
    private JButton erogazioneREF;
    private JComboBox selezionePaziente;
    private JLabel sintomiLabel;
    private JLabel diagnosiLabel;
    private JLabel prescrizioneLabel;
    private JLabel noteLabel;
    private JButton btnAggPrescr;
    private Paziente pazienteDestinatario;
    private Controller controller;
    private Referto refertoCorrente;


    public RefertoPanel(Controller controller) {
        this.controller = controller;
        this.refertoCorrente = refertoCorrente;

        setContentPane(erogaReferto);
        setTitle("Compila il Referto");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        dataCompilazione.setText(LocalDate.now().toString());

        dataCompilazione.setEditable(false);

        //CONTROLLO E AGGIUNT DELLA LISTA DEI PAZIENTI REGISTRATI NELLA COMBOBOX
        if(controller.getListaPazienti().isEmpty()){
            selezionePaziente.addItem("Nessun paziente registrato");
        } else {
            for (Paziente p : controller.getListaPazienti()) {
                selezionePaziente.addItem(p.getNome() + " " + p.getCognome() + " " + p.getCodiceFiscale());
            }
        }

        erogazioneREF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (idReferto.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"INSERIRE ID DEL REFERTO", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int idSelezionato = selezionePaziente.getSelectedIndex();
                Paziente pazienteSelezionato = controller.getListaPazienti().get(idSelezionato);
                int idIntero = Integer.parseInt(idReferto.getText());
                LocalDate dataReferto = LocalDate.now();
                String sintomi = sintomiDichiarati.getText();
                String diagnosis = diagnosi.getText();
                String note = noteAggiuntive.getText();
                Referto r = new Referto(idIntero, dataReferto, sintomi, diagnosis, note, null, null);

                pazienteSelezionato.getCartellaClinica().add(r);
                controller.aggiungiNuovoReferto(r);

                JOptionPane.showMessageDialog(null, "Referto erogato e salvato con successo nella cartella clinica di: " + pazienteSelezionato.getNome() + " " + pazienteSelezionato.getCognome() + " " + pazienteSelezionato.getCodiceFiscale());
                dispose(); // Chiude la finestra del referto dopo aver salvato
            }
        });

        setVisible(true);

        btnAggPrescr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AggiungiPrescrizionePanel aggiuntaPrescr = new AggiungiPrescrizionePanel(controller);
                aggiuntaPrescr.setRefertoCorrente(refertoCorrente);
                aggiuntaPrescr.setVisible(true);
                dispose();
            }
        });
    }


}