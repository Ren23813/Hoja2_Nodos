import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Representa las pruebas unitarias para la lógica del programa.
 */
public class StackTest {

    /**
     *  Prueba para agregar una cantidad deseada a la pila y verificar el tamaño final.
     */
    @Test
    public void agregarCantidadDeseadaALaPila(){
        CustomStack <Integer> customStack = new CustomStack<>();
        for (int i = 0; i < 5; i++) {
            customStack.push(i);
        }
        customStack.pop();
        assertTrue(customStack.size() == 4);
    }

    /**
     * Prueba para verificar que se devuelva null al intentar eliminar una pila que se encuentra vacía.
     */
    @Test
    public void devolverNullPorBorrarSinExistirAntesCola(){
        CustomStack customStack = new CustomStack<>();
        assertTrue(customStack.pop() == null );
    }

    /**
     * Prueba para comprobar el resultado de una operación con el formato postfix.
     */
    @Test
    public void comprobarCalculadoraOperacionCorrecta(){
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("1 2 + 7 *"); //Debería de dar 21. 1+2 = 3 ; 3*7 = 21
        assertEquals(21, comprobar);
    }

    /**
     *Prueba que determian una operación incorrecta.
     */
    @Test
    public void comprobarCalculadoraOperacionIncorrecta(){      //Se espera obtener un error. 
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("5 5 * 50 +"); //Debería de dar 75. 5*5 = 25 ; 25+50 = 75
        assertEquals(100, comprobar);   //a proposito, se coloca algo que se sabe fallará
    }

    /**
     * Prueba para comprobar fallos en los operadores.
     */
    @Test
    public void comprobarCalculadoraFalloExcesoDeOperadores(){   //Se programó para devolver 0 si existían más operadores que operandos
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("1 2 5 + -"); 
        assertEquals(0, comprobar);
    }

    /**
     * Prueba para comprobar el proceso al dividir entre cero.
     */
    @Test
    public void divisionPorCero(){            
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("0 33 /"); //Se programó para devolver 0 si se intentaba dividir por cero         
    }

    /**
     *  Prueba para comprobar que se realicen las divisiones correctamente.
     */
    @Test
    public void comprobarCalculadoraDivisionCorrecta(){
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("5 25 /"); 
        assertEquals(5, comprobar);
    }
}

