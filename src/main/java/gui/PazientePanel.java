package gui;

import controller.Controller;

import javax.swing.*;

public class PazientePanel extends JFrame {
    private JPanel pazientePanel;
    private JButton btnCartClin;
    private JButton btnPREN;

    public PazientePanel(Controller controller){

        setVisible(true);
        setContentPane(pazientePanel);
        setTitle("Login - Clinica");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
