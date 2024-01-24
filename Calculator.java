// Clase realizada por nuestros compañeros (los del trabajo anterior no respondieron, entonces se recurrió a encontrar a otros :D)
/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 20/01/24
 * Clase calculadora que lleva a cabo operaciones aritméticas básicas
 */
public class Calculator {

    /**
     * Método que realiza los cálculos en función del operador
     * @param operator Operador que se debe realizar
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la operación
     */
    public int calculate(char operator, int a, int b){
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * Suma de dos enteros
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la suma 
     */
    public int add (int a, int b) {return a+b;}

    /**
     * Resta de dos números
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la resta
     */
    public int subtract(int a, int b) {return a-b;}

    /**
     * Multiplicación de dos números
     * @param a Multiplicando 
     * @param b Multiplicador 
     * @return Producto
     */
    public int multiply(int a, int b) {return a*b;}

    /**
     * División de dos números
     * @param a Dividendo
     * @param b Divisor
     * @return Cociente
     */
    public int divide(int a, int b) {return a/b;}

}