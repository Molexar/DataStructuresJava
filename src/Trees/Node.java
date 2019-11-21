package Trees;

public class Node<T1> {
    Node<T1> right, left = null;
    private int key = 0;
    private T1 value = null;

    public Node(int key, T1 value){
        this.key = key;
        this.value = value;
    }
    public Node<T1> getLeft(){
        return this.left;
    }
    public Node<T1> getRight(){
        return this.right;
    }
    public int getKey(){
        return this.key;
    }
    public T1 getValue(){
        return this.value;
    }

    public int getLeftKey(){
        return getLeft().getKey();
    }
    public int getRightKey(){
        return getRight().getKey();
    }


    public void setValue(T1 value){
        this.value = value;
    }
    public void setKey(int key){
        this.key = key;
    }
    public void setLeft(Node<T1> left){
        this.left = left;
    }
    public void setRight(Node<T1> right){
        this.right = right;
    }

}
