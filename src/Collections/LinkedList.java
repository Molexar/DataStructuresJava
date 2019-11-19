package Collections;
import Collections.Element;

public class LinkedList {
    private int length;
    private Element head = null;

    public LinkedList(Element element){
        head = element;
        length += 1;
    }

    public void append(Element element){
        Element current = this.head;
        if ((current != null)&&(length >= 2)){
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(element);
            current.getNext().setPrev(current);
        }
        else if ((current != null)&&(length == 1)){
            current.setNext(element);
            current.getNext().setPrev(current);
        }
        else{
            head = element;
        }
        length++;
    }

    public Element getLast(){
        Element current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        return (current);
    }
    public Element getByPosition(int index){
        Element current = head;
        if (index > 0){
            int i = 0;
            while ((current.getNext() != null)&&(i<index-1)){
                current = current.getNext();
                i++;
            }
            return (current.getNext());
        }
        else if (index == 0){
            return head;
        }
        else{
            return null;
        }
    }
    public int getLength(){
        return (length);
    }
    public void insert(Element element, int index){
        Element current = head;
        int i = 0;
        if (index > 0){
            while ((current.getNext()!=null)&&(i<index)){
                current = current.getNext();
                i++;
            }
            element.setPrev(current);
            element.setNext(current.getNext());
            current.getNext().setPrev(element);
            length++;
        }
        else if (index == 0){
            head = element;
            element.setNext(current);
            current.setPrev(head);
            length++;
        }

    }
}
