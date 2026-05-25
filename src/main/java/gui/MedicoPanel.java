package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;


public class MedicoPanel extends JFrame {
    private JButton btnVisApp;
    private JButton btnREF;
    private JPanel medicoPanel;

    public MedicoPanel(Controller controller) {
        setVisible(true);
        setContentPane(medicoPanel);
        setTitle("Login - Clinica");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
