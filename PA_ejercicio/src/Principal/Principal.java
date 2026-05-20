package Principal;


import Controlador.Cejemplotabla;
//import Controlador.Crelogdol; // Comentado para que no salga el reloj

public class Principal {
   // static Crelogdol x;
   static Cejemplotabla y;

   public static void main(String[] args) {
       try {
           // x = new Crelogdol();
           y = new Cejemplotabla();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}