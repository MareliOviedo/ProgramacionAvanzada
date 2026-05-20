package parte1.controlador;

import parte1.vista.Practica02_b2Vista;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica02_b2Controlador implements ActionListener {
    private Practica02_b2Vista vista;

    public Practica02_b2Controlador(Practica02_b2Vista vista) {
        this.vista = vista;
        this.vista.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.Bsalir) {
            String cadena = "valor de Jtextfield: " + vista.campoTexto.getText().trim();
            cadena += "\nvalor de JPasswordField: " + new String(vista.campoPassword.getPassword()).trim();
            cadena += "\nvalor de Jtextarea: " + vista.areaTexto.getText();
            cadena += "\nvalor de Jformattedtextfield: " + vista.campoFormateado.getText().trim();
            cadena += "\nvalor de spinner: " + vista.spinner.getValue().toString();
            cadena += "\nvalor de slider: " + String.valueOf(vista.slider.getValue());

            if (vista.comboBox.getSelectedIndex() > -1) {
                cadena += "\nvalor de combo es: " + vista.comboBox.getSelectedItem().toString();
            }

            JOptionPane.showMessageDialog(vista, cadena);
        }
    }
}