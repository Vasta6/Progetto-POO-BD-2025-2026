package gui;

import controller.Controller;
import model.Farmaco;
import model.Paziente;
import model.Prescrizione;
import model.Referto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AggiungiPrescrizionePanel extends JFrame {
    private JPanel aggiuntaPrescr;
    private JButton btnAggiungi;
    private JLabel durataLabel;
    private JTextField durataTerapia;
    private JLabel dosaggioLabel;
    private JTextField dosaggioGiornaliero;
    private JLabel farmacoLabel;
    private JComboBox selezioneFarmaco;
    private Controller controller;
    private Referto refertoCorrente;

    public void setRefertoCorrente(Referto refertoCorrente) {
        this.refertoCorrente = refertoCorrente;
    }


    public AggiungiPrescrizionePanel(Controller controller) {
        this.controller = controller;
        this.refertoCorrente = refertoCorrente;

        setContentPane(aggiuntaPrescr);
        setTitle("Aggiungi Prescrizione");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        for (Farmaco f : controller.getListaFarmaci()) {
            selezioneFarmaco.addItem(f.getNomCommerciale() + " " + f.getPrincipioAttivo() + " " + f.getPrezzo());
        }

        btnAggiungi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int indiceFarmaco = selezioneFarmaco.getSelectedIndex();
                int giorniTerapia = Integer.parseInt(durataTerapia.getText());
                String dosaggio = dosaggioGiornaliero.getText();
                Farmaco farmaco = controller.getListaFarmaci().get(indiceFarmaco);
                Prescrizione p = new Prescrizione(giorniTerapia,dosaggio,null,farmaco);
                controller.aggiungiPrescrizione(refertoCorrente,p);







                RefertoPanel erogaReferto = new RefertoPanel(controller);
                erogaReferto.setVisible(true);
                dispose();
            }

        });
    }

}
