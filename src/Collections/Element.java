package Collections;

public class Element<T> {
    private Element next = null;
    private Element prev = null;
    private T value = null;

    public Element(T value){
        this.value = value;
    }
    public Element getNext(){
        return (next);
    }
    public Element getPrev(){
        return (prev);
    }
    public void setNext(Element newNext){
        next = newNext;
    }
    public void setPrev(Element newPrev){
        prev = newPrev;
    }
    public T show(){
        return (value);
    }
}
