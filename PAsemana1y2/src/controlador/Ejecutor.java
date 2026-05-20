package controlador;

public class Ejecutor {
	    
		 
	    private static Object controlador;
	    
	 
	    public static void main(String[] args) {
	        
	        try {
	            
	            setControlador(new Cejercicioclase01_b());
	            
	        } catch (Exception e) {
	            System.err.println("Error al iniciar el sistema:");
	            e.printStackTrace();
	        }
	    }


		public static Object getControlador() {
			return controlador;
		}


		public static void setControlador(Object controlador) {
			Ejecutor.controlador = controlador;
		}
}
