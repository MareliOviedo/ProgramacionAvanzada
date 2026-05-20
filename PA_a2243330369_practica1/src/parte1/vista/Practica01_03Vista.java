package parte1.vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Practica01_03Vista extends JDialog {

    private JPanel contentPane;
    private JTabbedPane tabbedPane;

    public Practica01_03Vista() {
        setModal(true);
        inicializarVentana();
        inicializarComponentes();
    }

    private void inicializarVentana() {
        setTitle("Practica01_03 - JDialog");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    private void inicializarComponentes() {

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Pestaña 1", crearPanel("Contenido pestaña 1"));
        tabbedPane.addTab("Pestaña 2", crearPanel("Contenido pestaña 2"));
        tabbedPane.addTab("Pestaña 3", crearPanel("Contenido pestaña 3"));
        tabbedPane.addTab("Pestaña 4", crearPanel("Contenido pestaña 4"));

        contentPane.add(tabbedPane, BorderLayout.CENTER);

        setContentPane(contentPane);
    }

    private JPanel crearPanel(String texto) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(texto, JLabel.CENTER), BorderLayout.CENTER);
        return panel;
    }
}
