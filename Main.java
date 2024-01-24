/**
 * Clase principal del programa.
 */
public class Main {

    /**
     * Método principal, ejecuta el programa.
     * @param args
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); 
        // Debido a que no se estableció una interfaz general para todos los grupos de la clase, los métodos detallados en la Clase (Calculator) creada por el otro grupo difieren de cantidad, pero realizan las mismas funcionalidades; por lo tanto, aunque no se implementa de manera total con nuestro código, en esencia, funciona de la misma manera que nuestro código.

        Vista vista = new Vista();
        vista.leerDatosArchivo("datos.txt");
        
    }
}