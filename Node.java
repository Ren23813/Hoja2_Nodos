/**
 * Clase que representa los nodos del programa.
 * Clase realizada durante el periodo de clase, por parte del catedrático y toda la sección.
 */
public class Node <T> {     
    T value;
    Node <T> next;

    /**
     * Constructor de la clase.
     * @param val
     */
    public Node(T val){
        value = val;
        next = null;
    }

    /**
     * Obtiene el valor almacenado.
     * @return
     */
    public T getValue(){
        return value;
    }

    /**
     * Obtiene el siguiente nodo.
     * @return
     */
    public Node <T> getNext(){
        return next;
    }

    /**
     * Establece el nuevo valor del nodo.
     * @param newValue
     */
    public void setValue(T newValue){
        value = newValue;
    }

    /**
     * Establece al siguiente nodo.
     * @param n
     */
    public void setNext(Node <T>n){
        next = n;
    }
}
