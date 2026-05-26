package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MedicoPanel extends JFrame {
    private JButton btnVisApp;
    private JButton btnREF;
    private JPanel medicoPanel;

    public MedicoPanel(Controller controller) {
        setVisible(true);
        setContentPane(medicoPanel);
        setTitle("Area Personale");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnREF.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                RefertoPanel erogaReferto = new RefertoPanel(controller);
                erogaReferto.setVisible(true);
                dispose();
            }
        });
    }
}
