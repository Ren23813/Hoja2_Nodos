import static org.junit.Assert.*;
import org.junit.Test;

public class StackTest {

    @Test
    public void agregarCantidadDeseadaALaPila(){
        CustomStack <Integer> customStack = new CustomStack<>();
        for (int i = 0; i < 5; i++) {
            customStack.push(i);
        }
        customStack.pop();
        assertTrue(customStack.size() == 4);
    }

    @Test
    public void devolverNullPorBorrarSinExistirAntesCola(){
        CustomStack customStack = new CustomStack<>();
        assertTrue(customStack.pop() == null );
    }

    @Test
    public void comprobarCalculadoraOperacionCorrecta(){
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("1 2 + 7 *"); //Debería de dar 21. 1+2 = 3 ; 3*7 = 21
        assertEquals(21, comprobar);
    }

    @Test
    public void comprobarCalculadoraOperacionIncorrecta(){      //Se espera obtener un error. 
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("5 5 * 50 +"); //Debería de dar 75. 5*5 = 25 ; 25+50 = 75
        assertEquals(100, comprobar);   //a proposito, se coloca algo que se sabe fallará
    }

    @Test
    public void comprobarCalculadoraFalloExcesoDeOperadores(){   //Se programó para devolver 0 si existían más operadores que operandos
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("1 2 5 + -"); 
        assertEquals(0, comprobar);
    }

    @Test
    public void divisionPorCero(){            
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("0 33 /"); //Se programó para devolver 0 si se intentaba dividir por cero         
    }

    @Test
    public void comprobarCalculadoraDivisionCorrecta(){
        Vista vista = new Vista();
        int comprobar = vista.expresionEvaluar("5 25 /"); 
        assertEquals(5, comprobar);
    }
}

