package parte1.controlador;

import parte1.vista.Practica02_bVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica02_bControlador implements ActionListener {

    private Practica02_bVista vista;

    public Practica02_bControlador() {

        vista = new Practica02_bVista();
        vista.setVisible(true);

        vista.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnSalir) {
            System.exit(0);
        }
    }
}
