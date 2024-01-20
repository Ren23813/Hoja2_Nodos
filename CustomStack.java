import java.util.LinkedList;

public class CustomStack <T> {
    private Node<T> lastNode;
    private Node<T> firstNode;
    private LinkedList<T>  pila;


    public void push(T value){
        if(lastNode == null){
            lastNode = new Node <T>(value);
            firstNode = lastNode; 
        }
        else {
            Node<T> current = new Node <T>(value);
            
            current.setNext(firstNode); 
            firstNode = current;
        }
    }


    public T pop(){
        if(firstNode != null){
            T value = firstNode.getValue();
            firstNode = firstNode.getNext();
            return value;
        }
        return null;
    }

    public int size(){
        return pila.size();
    }

}