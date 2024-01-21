import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Representa la vista del programa y maneja la lógica de evaluación de los datos.
 */
public class Vista {
   
    private CustomStack<Integer> customStack;   //Se declara como int el que fue declarado como dato abstracto en la clase CustomStack

    /**
     * Constructor de vista.
     */
    public Vista(){
        this.customStack  = new CustomStack<>();

        System.out.println("--------------- CALCULADORA ---------------");
    }

    /**
     * Lee los datos del archivo txt y devuelve los resultados.
     * @param archivo
     */
    public void leerDatosArchivo(String archivo){

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String line;

            while ( (line = br.readLine()) != null ) {
                // se muestran los resultados
                showResultado(line);
                
            }

        }
        catch (IOException e){
            e.printStackTrace();

        }

    }

    /**
     * Muestra los resultados.
     * @param expresion
     */
    public void showResultado(String expresion){
        System.out.println("\nPila | Operación: " );

        int resultado = expresionEvaluar( expresion);

        System.out.println( "   Resulatado de " +expresion + " : " + resultado);

    }

    /**
     *Evalúa los datos con el formato postfix y devuelve el resultado. 
     * @param expresion
     * @return
     */
    public int expresionEvaluar(String expresion){
        CustomStack<Integer> pila = new CustomStack<>();
        
        String[] data = expresion.split(" ");   //Se dividen las lineas del .txt para que por cada espacio se analice la siguiente inmediata entrada

        for(String datos : data){

            if (isNumber(datos)){
                pila.push(Integer.parseInt(datos));
            }

            // condición que ayuda a detectar errores del postfix, si hay más operandos para los operadores
            else if (isOperator(datos)){
                if(pila.size() >2){
                    System.out.println("Error, exceso de operandos para los operadores");
                    return 0;
                }

                int operando1 = pila.pop();
                int operando2 = pila.pop();

                switch (datos) {

                    case "+":
                        
                        pila.push(operando1 + operando2);
                        break;
                    
                    case "-":
                        pila.push(operando1 - operando2);

                        break;

                    case "/":
                        if (operando2 == 0){
                            System.out.println("No es posible dividir entre cero");
                            return 0;
                        }

                        pila.push(operando1 /operando2);
                        break;
                    
                    case "*":
                        pila.push(operando1* operando2);

                        break;


                    default:
                        System.out.println("El operando no es válido");
                        return 0;
                }
            }
            else{
                System.out.println("Error del dato? ");
                return 0;
            }
        }
        
        // para determinar si es correcto el formato 
        if(pila.size() != 1){
            System.out.println("Error del formato del archivo");
            return 0;
        }

        return pila.pop();
      
    }


    /**
     * Determina si el dato es un número.
     * @param dato
     * @return
     */
    private boolean isNumber(String dato){
        try{
            Integer.parseInt(dato);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    /**
     * Determina si el dato es un operador.
     * @param dato
     * @return
     */
    private boolean isOperator(String dato){
        return dato.equals("-") ||  dato.equals("+")  || dato.equals("*") || dato.equals("/");
    }
}

