import Collections.*;
public class Main {
    public static void main(String[] args) {
        Element<Integer> e1 = new Element<>(5);
        Element<String> e2 = new Element<>("Hello");
        LinkedList ll = new LinkedList(e1);
        System.out.println(ll.getLast().show());
        ll.append(e2);
        System.out.println(ll.getLength());
        System.out.println(ll.getByPosition(1).show());
        ll.insert(e2, 0);
        System.out.println(ll.getByPosition(0).show());
    }
}
