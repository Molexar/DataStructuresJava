import Trees.*;
public class Main {
    public static void main(String[] args) {
        Node<Integer> e1 = new Node<>(10, 10);
        TreeMap<Integer> tMap = new TreeMap<>(e1);
        System.out.println(tMap.get(10));
        tMap.addNode(5, 5);
        tMap.addNode(1, 1);
        tMap.addNode(4, 4);
        tMap.addNode(35, 35);
        tMap.addNode(20, 20);
        tMap.addNode(17, 17);
        tMap.addNode(31, 31);
        tMap.addNode(99, 99);
        System.out.println(tMap.get(16));
        tMap.removeNode(5);
        tMap.removeNode(35);
        tMap.removeNode(20);
        tMap.removeNode(99);
    }
}
