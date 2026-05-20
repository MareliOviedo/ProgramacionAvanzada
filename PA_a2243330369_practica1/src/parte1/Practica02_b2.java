package parte1;
import parte1.vista.Practica02_b2Vista;
import parte1.controlador.*;

public class Practica02_b2 {
    public static void main(String[] args) {
        // Instanciamos la vista
        Practica02_b2Vista vista = new Practica02_b2Vista();
        // Instanciamos el controlador pasándole la vista
        new Practica02_b2Controlador(vista);
    }
}
