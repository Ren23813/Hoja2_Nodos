public class Node <T> {
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
