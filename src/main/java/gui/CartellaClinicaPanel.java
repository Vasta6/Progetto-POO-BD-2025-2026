package gui;

import controller.Controller;
import model.Paziente;
import model.Referto;

import javax.swing.*;
import java.util.ArrayList;

public class CartellaClinicaPanel extends JFrame{
    private Controller controller;
    private Paziente paziente;

    private JPanel cartellaClinica;
    private JScrollPane scorrimentoCartellaClinica;
    private JList<String> cartClinPaz;

    public CartellaClinicaPanel(Controller controller){
        this(controller,null);

        initGUI();
    }

    public void initGUI(){

        setVisible(true);
        setContentPane(cartellaClinica);
        setTitle("Cartella clinica paziente: " + paziente.getNome() + " " +  paziente.getCognome());
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public CartellaClinicaPanel(Controller controller, Paziente paziente) {
        this.paziente = paziente;
        this.controller = controller;

        initGUI();

        if(this.paziente == null){
            this.paziente = controller.getListaPazienti().getLast();
        }

        DefaultListModel<String> listaCartella = new DefaultListModel<>();
        ArrayList<Referto> cartella = this.paziente.getCartellaClinica();

        if(cartella == null || cartella.isEmpty()){
            listaCartella.addElement("Nessun referto presente nella tua cartella clinica");
        }else{
            for(Referto re : cartella){

                String stringaReferto = "ID: " + re.getIdReferto() +
                                        " | Data: " + re.getDataCompilazione() +
                                        " | Diagnosi " + re.getDiagnosi();

                listaCartella.addElement(stringaReferto);
            }
        }
        cartClinPaz.setModel(listaCartella);
        setVisible(true);

    }
}
