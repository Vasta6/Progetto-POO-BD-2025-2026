package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends  JFrame {
    private JPanel LogInGUI;
    private JButton btnAccedi;
    private JPasswordField passwordText;
    private JTextField loginText;
    private JLabel login;
    private JLabel password;
    private JButton btnREG;
    private JLabel Titolo;
    private static JFrame frameHome;
    private Controller controller;



    public Home(Controller controller) {
        this.controller = new Controller();

        setContentPane(LogInGUI);
        setTitle("Login - Clinica");
        setSize(550,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Add action listeners or other initialization code here
        btnAccedi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginText.getText();
                String password = new  String(passwordText.getPassword());

                if (login.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(LogInGUI, "Inserire LogIn e Password", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }
                if (login.contains("@med")){
                    System.out.println("Utente riconosciuto: Medico");
                    JOptionPane.showMessageDialog(LogInGUI, "Benvenuto Dottor " + loginText.getText());

                    MedicoPanel medicoPanel = new MedicoPanel(controller);
                    medicoPanel.setVisible(true);
                    dispose();

                } else if (login.contains("@")){
                    System.out.println("Utente riconosciuto: Paziente");
                    JOptionPane.showMessageDialog(LogInGUI, "Benvenuto " + loginText.getText());

                    PazientePanel pazientePanel = new PazientePanel(controller);
                    pazientePanel.setVisible(true);
                    dispose();
                } else{

                    JOptionPane.showMessageDialog(LogInGUI, "Formato LogIn inserito non valido", "ATTENZIONE", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnREG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AggiungiNuovoPaziente registrazionePaziente = new AggiungiNuovoPaziente(controller);
                registrazionePaziente.setVisible(true);
                dispose();
            }
        });
    }
}
