package Trees;
import Trees.Node;


/*
  Алгоритм удаления вершины дерева не совершенен,
  так как минимум в правом поддереве
  может не быть меньше родителя вершины.
 */
public class TreeMap<T1> {
    private int h;
    private Node<T1> root;

    public TreeMap(Node<T1> root){
        this.root = root;
        this.h++;
    }

    public T1 get(int k){
        Node<T1> temp = root;
        while (temp != null){
            if (temp.getKey() == k){
                return temp.getValue();
            }
            if (k < temp.getKey()){
                temp = temp.getLeft();
            }
            else {
                temp = temp.getRight();
            }
        }
        return null;
    }

    public void addNode(int key, T1 value){
        Node<T1> temp = root;
        Node<T1> prev = null;
        while (temp != null){
            if (temp.getKey() == key){
                temp.setValue(value);
            }
            else if (key < temp.getKey()){
                prev = temp;
                temp = temp.getLeft();
            }
            else{
                prev = temp;
                temp = temp.getRight();
            }
        }
        if (temp==null){
            Node<T1> newNode = new Node<>(key, value);
            if (prev == null){
                this.root = newNode;
            }
            else{
                if (key < prev.getKey()){
                    prev.setLeft(newNode);
                    this.h++;
                }
                else{
                    prev.setRight(newNode);
                    this.h++;
                }
            }
        }

    }


    public void removeNode(int key){
        Node<T1> temp = root;
        Node<T1> prev = null;
        while (temp != null){
            if (temp.getKey() == key){
                break;
            }
            else{
                prev = temp;
                if (temp.getKey() > key){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
        }
        if (temp == null){
            return; //Вершина для удаления не найдена.
        }
        if ((temp.getLeft() == null)&&(temp.getRight() == null)){
            if (prev == null){
                this.root = null;
                return;
            }
            if (prev.getLeft() == temp){
                prev.setLeft(null);
            }
            else{
                prev.setRight(null);
            }
            return;
        }
        else{
            if (temp.getRight() == null){
                if (prev == null){
                    this.root = temp.getLeft();
                }
                else{
                    if (temp == prev.getLeft()){
                        prev.setLeft(temp.getLeft());
                    }
                    else{
                        prev.setRight(temp.getLeft());
                    }
                }
            }
            else{
                Node<T1> leftMost = temp.getRight();
                prev = null;
                while (leftMost.getLeft() != null){
                    prev = leftMost;
                    leftMost = leftMost.getLeft();
                }
                if (prev != null){
                    prev.setLeft(leftMost.getRight());
                } else{
                    temp.setRight(leftMost.getRight());
                }
                temp.setKey(leftMost.getKey());
                temp.setValue(leftMost.getValue());
            }
        }
    }
}
