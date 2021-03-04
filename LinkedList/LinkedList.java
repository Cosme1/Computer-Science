package LinkedList;

public class LinkedList{
    private Node head;
    private int listCount;

    public LinkedList() {
        head = new Node(-1); //Dummy value that we will just ignore
        listCount = 0;
    }

    public void addTail(int val) {
        //To Do
    }

    public void addHead(int val) {
        Node new_Node = new Node(val);
        if (head == null){
            head = new_Node;
        } else {
            Node last = head;
            while (head != null) {
                head = last.getNext();
            }
            last = new_Node;
        }
    }

    public void addSorted(int val) {
        Node current = head;
        while (current.hasNext() && (current.getNext().getValue() < val)){
            current = current.getNext();
        }
        Node tmp = current.getNext();
        current.setNext((new Node(val)));
        current.getNext().setNext(tmp);
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i <= index; i++){
            current.getNext();
        }
        return current.getValue();
        
    }

    public void remove(int index) {
        Node current = head;
        for (int i = 0; i < index; i++){
            current.getNext();
        }
        Node next = current.getNext().getNext();
        current.setNext(next);
    }

    public int size() {
        return listCount;
    }

    public String toString() {
        Node current = head;
        String output = "LinkedList[ ";
        while (current.hasNext()) {
            current = current.getNext();
            output += Integer.toString(current.getValue())+"";
        }
        output+= "]";
        return output;

    }
}