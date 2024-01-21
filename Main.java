/**
 * Clase principal del programa.
 */
public class Main {

    /**
     * Método principal, ejecuta el programa.
     * @param args
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.leerDatosArchivo("datos.txt");
        
    }
}