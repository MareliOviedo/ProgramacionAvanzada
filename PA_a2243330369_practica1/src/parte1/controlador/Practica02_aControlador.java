package parte1.controlador;

import parte1.vista.Practica02_aVista;

public class Practica02_aControlador {

    private Practica02_aVista vista;

    public Practica02_aControlador() {

        vista = new Practica02_aVista();
        vista.setVisible(true);

        // Aquí agregamos funcionalidad al botón
        vista.btnSalir.addActionListener(e -> System.exit(0));
    }
}