public class CircularLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    Node start = null;

    private boolean isEmpty() {
        return (start == null);
    }

    public void insertAtEnd(T value) {
        Node n = new Node(); 
        n.data = value;
        if (isEmpty()) {
            n.next = n; // For the first node, make it point to itself
            start = n;
        } else {
            Node t = start;
            while (t.next != start) {
                t = t.next;
            }
            t.next = n; 
            n.next = start; // Make the last node point back to start
        }
    }

    public void insertAtStart(T value) {
        Node n = new Node(); 
        n.data = value;

        if (!isEmpty()) { 
            Node lastNode = start;
            while (lastNode.next != start) {
                lastNode = lastNode.next;
            }
            n.next = start;
            lastNode.next = n; // Make the last node point to the new start
        } else {
            n.next = n; // For the first node, make it point to itself
        }
        start = n; 
    }

    public T deleteAtStart(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return null;
        }else{
           T num = start.data;
           Node lastNode = start;
           while (lastNode.next != start) {
               lastNode = lastNode.next;
           }
           lastNode.next = start.next; // Update the last node to point to the new start
           start = start.next;
           return num;
        }
    }

    public T deleteNodeAtEnd(){
        if(isEmpty()) return null;
        Node t = start;
        Node prev = null;
        while (t.next != start) {
            prev = t;
            t = t.next;
        }
        T num = t.data;
        if (prev != null) {
            prev.next = start; // Update the previous node to point to start
        } else {
            start = null; // If there was only one node, set start to null
        }
        return num;
    }

    public boolean searchNode(T key){
        if (isEmpty()) return false;
        Node t = start;
        do {
            if (t.data.equals(key)) return true;
            t = t.next;
        } while (t != start);
        return false; 
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node t = start;
        do {
            System.out.print(t.data + " -> ");
            t = t.next;
        } while (t != start);
        System.out.println(start.data); // Print the start node again to indicate circular
    }


    public void insertAtBetween(T value , int pos){
        Node n = new Node();
        n.data= value;
        int count = 0;
        if(pos<1){
            System.out.println("Invalid position");
            return;
        }else if(isEmpty()){
            insertAtStart(value);
        }else{
          Node currentNode = start;
          while (count < pos-1 && currentNode.next != start) {
            currentNode= currentNode.next;
            count++;
          }
          n.next  = currentNode.next;
          currentNode.next = n;

        }
    }

    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.insertAtStart(4);
        list.insertAtEnd(5);
        list.insertAtStart(1);
        list.insertAtBetween(10, 3);
        list.printList();
    }
}
