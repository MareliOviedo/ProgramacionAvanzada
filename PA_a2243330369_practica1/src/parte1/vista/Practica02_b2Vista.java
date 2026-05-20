package parte1.vista;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Practica02_b2Vista extends JFrame {
    public String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
    public JComboBox<String> comboBox;
    public JPanel panel;
    public JButton Bsalir;
    public JTextField campoTexto;
    public JPasswordField campoPassword;
    public JTextArea areaTexto;
    public JFormattedTextField campoFormateado;
    public JSpinner spinner;
    public JSlider slider;

    public Practica02_b2Vista() {
        setTitle("Ejemplo de componentes de entrada de texto");
        setSize(442, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 403, 440);

        // --- Configuración de Componentes ---
        JLabel etiqueta = new JLabel("JButton:");
        etiqueta.setBounds(0, 3, 178, 36);
        Bsalir = new JButton("Haz clic para Salir");
        Bsalir.setBounds(188, 3, 172, 36);

        JLabel etiqueta2 = new JLabel("JTextField:");
        etiqueta2.setBounds(0, 49, 148, 36);
        campoTexto = new JTextField();
        campoTexto.setBounds(188, 50, 172, 36);

        JLabel etiqueta3 = new JLabel("JPasswordField:");
        etiqueta3.setBounds(0, 95, 148, 36);
        campoPassword = new JPasswordField();
        campoPassword.setBounds(188, 97, 172, 36);

        JLabel etiqueta4 = new JLabel("JTextArea:");
        etiqueta4.setBounds(0, 141, 148, 36);
        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        scrollPane.setBounds(188, 141, 172, 80);

        JLabel etiqueta5 = new JLabel("JFormattedTextField:");
        etiqueta5.setBounds(0, 230, 148, 36);
        campoFormateado = new JFormattedTextField();
        campoFormateado.setBounds(188, 230, 172, 36);
        campoFormateado.setValue(12345.67);

        JLabel etiqueta6 = new JLabel("JSpinner:");
        etiqueta6.setBounds(0, 275, 141, 36);
        spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        spinner.setBounds(188, 275, 172, 36);

        JLabel etiqueta7 = new JLabel("JSlider:");
        etiqueta7.setBounds(0, 320, 141, 36);
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setBounds(188, 320, 172, 45);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JLabel etiqueta8 = new JLabel("JComboBox:");
        etiqueta8.setBounds(0, 375, 148, 36);
        comboBox = new JComboBox<>(opciones);
        comboBox.setBounds(188, 375, 172, 36);

        // Agregar al panel
        panel.add(etiqueta); panel.add(Bsalir);
        panel.add(etiqueta2); panel.add(campoTexto);
        panel.add(etiqueta3); panel.add(campoPassword);
        panel.add(etiqueta4); panel.add(scrollPane);
        panel.add(etiqueta5); panel.add(campoFormateado);
        panel.add(etiqueta6); panel.add(spinner);
        panel.add(etiqueta7); panel.add(slider);
        panel.add(etiqueta8); panel.add(comboBox);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void setControlador(ActionListener listener) {
        Bsalir.addActionListener(listener);
    }
}
