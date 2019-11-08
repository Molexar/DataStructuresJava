import DataStructures.*;
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5, 6, 7, 8, 9, 10);
        stack.printer();
        stack.pop();
        stack.printer();
        stack.push(23);
        stack.printer();
    }
}
