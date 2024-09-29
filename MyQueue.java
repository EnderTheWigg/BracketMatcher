import java.util.LinkedList;
public class MyQueue<E> implements Queue<E>
{
    private LinkedList list;
    private int size;
    public MyQueue()
    {
        list = new LinkedList();
        size = 0;
    }
    public E peek(){
        if(size == 0)
            return null;
        return (E)list.get(0);
    }
    public boolean add(E obj){
        list.add(obj);
        size++;
        return true;
    }
    public E remove(){
        if(size == 0)
            return null;
        E x = (E)list.remove(0);
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