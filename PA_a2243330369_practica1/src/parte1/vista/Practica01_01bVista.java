package parte1.vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Practica01_01bVista extends JFrame {

    private JPanel contentPane;
    private JTabbedPane tabbedPane;
    private JDesktopPane desktopPane;

    public Practica01_01bVista() {
        inicializarVentana();
        inicializarComponentes();
    }

    private void inicializarVentana() {
        setTitle("Practica01_01b - Contenedores Secundarios");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();

        // 🔹 Pestaña 1 → JPanel simple
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Este es un JPanel"));
        tabbedPane.addTab("JPanel", panel1);

        // 🔹 Pestaña 2 → JScrollPane
        JTextArea areaTexto = new JTextArea(10, 30);
        areaTexto.setText("Este es un JTextArea dentro de un JScrollPane\n\nAgrega más texto para probar el scroll...");
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        tabbedPane.addTab("JScrollPane", scrollPane);

        // 🔹 Pestaña 3 → JDesktopPane con JInternalFrame
        desktopPane = new JDesktopPane();

        JInternalFrame internalFrame = new JInternalFrame(
                "Ventana Interna",
                true, true, true, true
        );

        internalFrame.setSize(250,150);
        internalFrame.setVisible(true);
        internalFrame.add(new JLabel("Soy un JInternalFrame", JLabel.CENTER));

        desktopPane.add(internalFrame);
        tabbedPane.addTab("JDesktopPane", desktopPane);

        // 🔹 Pestaña 4 → Otro JPanel
        JPanel panel4 = new JPanel();
        panel4.add(new JLabel("Otra pestaña adicional"));
        tabbedPane.addTab("Extra", panel4);

        contentPane.add(tabbedPane, BorderLayout.CENTER);
        setContentPane(contentPane);
    }
}
