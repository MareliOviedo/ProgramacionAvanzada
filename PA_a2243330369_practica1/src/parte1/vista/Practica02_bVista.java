package parte1.vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Practica02_bVista extends JFrame {

    public JPanel panelPrincipal;
    public JButton btnSalir;

    public Practica02_bVista() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Frame Practica02_b");

        panelPrincipal = new JPanel();
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(null);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(145, 124, 89, 23);
        panelPrincipal.add(btnSalir);
    }
}