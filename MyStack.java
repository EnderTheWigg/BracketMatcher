import java.util.LinkedList;
public class MyStack<E> implements Stack<E>
{
    private LinkedList list;
    private int size;
    public MyStack()
    {
        list = new LinkedList();
        size = 0;
    }
    public E peek(){
        if(size == 0)
            return null;
        return (E)list.get(size() - 1);
    }
    public void push(E item){
        list.add(item);
        size++;
    }
    public E pop(){
        if(size == 0)
            return null;
        E x = (E)list.remove(size - 1);
        size--;
        return x;
    }
    public  boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }
    public int size(){
        return size;
    }
    
}