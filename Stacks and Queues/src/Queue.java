import java.util.LinkedList;

public class Queue {
    private LinkedList list;
    
    public Queue(){
        list = new LinkedList();
    }

    public boolean isEmpty() {
        return (list.size() == 0);
    }

    public void enqueue(Object item){
        list.add(item);
    }

    public Object peek() {
        return list.get(0);
    }
}
