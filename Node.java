public class Node <T> {     //Clase realizada durante el periodo de clase, por parte del catedrático y toda la sección. 
    T value;
    Node <T> next;

    public Node(T val){
        value = val;
        next = null;
    }

    public T getValue(){
        return value;
    }

    public Node <T> getNext(){
        return next;
    }

    public void setValue(T newValue){
        value = newValue;
    }

    public void setNext(Node <T>n){
        next = n;
    }
}
