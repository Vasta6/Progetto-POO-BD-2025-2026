package gui;

import model.*;
import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RefertoPanel extends JFrame{
    private JPanel erogaReferto;
    private JTextField dataCompilazione;
    private JTextField idReferto;
    private JTextArea sintomiDichiarati;
    private JTextArea diagnosi;
    private JTextArea noteAggiuntive;
    private JButton erogazioneREF;


    public RefertoPanel(Controller controller) {

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
}
