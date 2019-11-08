package DataStructures;
import java.util.Arrays;

public class Stack {
    private int lengthStack;
    private boolean isStack;
    private int[] stack;

    public Stack(int ... data){
        lengthStack = data.length;
        stack = data;
    }
    public void push(int pushing){
        stack = Arrays.copyOf(stack, lengthStack+1);
        stack[lengthStack] = pushing;
        lengthStack++;
    }
    public void pop(){
        stack = Arrays.copyOf(stack, lengthStack-1);
        lengthStack--;
    }
    public void printer(){
        for (int i=0;i<lengthStack;i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public int getLengthStack(){
        System.out.println(lengthStack);
    }
}
