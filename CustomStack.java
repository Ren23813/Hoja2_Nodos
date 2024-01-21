import java.util.LinkedList;    //Clase realizada durante el periodo de clase, por parte del catedrático y toda la sección. 

public class CustomStack <T> {
    private Node<T> lastNode;
    private Node<T> firstNode;
 


    public void push(T value){
        if(lastNode == null){       //En caso aún no se tenga registro de algún nodo. 
            lastNode = new Node <T>(value);
            firstNode = lastNode; 
        }
        else {      //Para crear un nuevo nodo, cuando existe uno previo. 
            Node<T> current = new Node <T>(value);
            
            current.setNext(firstNode); 
            firstNode = current;
        }
    }


    public T pop(){
        if(firstNode != null){      //Si existe algún nodo creado
            T value = firstNode.getValue();
            firstNode = firstNode.getNext();
            return value;
        }
        return null;        //Si aún no existe nodo creado previamente. 
    }

    public int size(){
        int counter = 0;

        Node<T> current = firstNode;

        while(current != null){
            counter  ++;    //Para llevar conteo de nodos.
            current  = current.getNext();
        }

        return counter;
    }


}