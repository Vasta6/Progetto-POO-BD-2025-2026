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
    private JLabel idRef;
    private JLabel selPazienteLabel;
    private Paziente pazienteDestinatario;
    private Controller controller;
    private Referto refertoCorrente;


    public RefertoPanel(Controller controller) {
        this.controller = controller;
        this.refertoCorrente = new Referto(0, LocalDate.now(), "", "", "", null, null);;

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


                boolean haAllergia = controller.erogaPrescrizioneSicura(pazienteSelezionato, refertoCorrente);

                if (haAllergia) {
                    JOptionPane.showMessageDialog(RefertoPanel.this, "IMPOSSIBILE ERORAGARE IL REFERTO.\n" +
                            "Il paziente selezionato è allergico al farmaco prescritto", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    return;
                }


                try {
                    refertoCorrente.setIdReferto(Integer.parseInt(idReferto.getText()));
                    refertoCorrente.setDataCompilazione(LocalDate.now());
                    refertoCorrente.setSintomiDichiarati(sintomiDichiarati.getText());
                    refertoCorrente.setDiagnosi(diagnosi.getText());
                    refertoCorrente.setNoteAggiuntive(noteAggiuntive.getText());

                    pazienteSelezionato.getCartellaClinica().add(refertoCorrente);
                    controller.aggiungiNuovoReferto(refertoCorrente);

                    JOptionPane.showMessageDialog(null, "Referto erogato e salvato!");
                    dispose();
                } catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "INSERIRE UN ID IN FORMATO VALIDO (es: 1)",
                            "ERRORE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);

        btnAggPrescr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AggiungiPrescrizionePanel aggiuntaPrescr = new AggiungiPrescrizionePanel(controller,refertoCorrente);
                aggiuntaPrescr.setVisible(true);
            }
        });
    }


}