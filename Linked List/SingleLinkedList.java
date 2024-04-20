public class SingleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    Node start = null;

    private boolean isEmpty() {
        return (start == null);
    }

    public void insertAtEnd(T value) {
        Node n = new Node(); // Use the constructor to initialize the node
        n.data=value;
        if (isEmpty()) {
            start = n;
        } else {
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n; // It should be t.next, not start.next
        }
    }

    public void insertAtStart(T value) { // Corrected the spelling mistake here
        Node n = new Node(); // Use the constructor to initialize the node
        n.data=value;

        if (!isEmpty()) { // Check if the list is not empty
            n.next = start; // Point the new node to the current start
        }
        start = n; // Update start to the new node
    }

    public T deleteAtStart(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return null;
        }else{
           T num = start.data;
           start=start.next;
           return num;
        }
        
    }

    public T deleteNodeAtEnd(){
        if(isEmpty()) return null;
       Node t= start;
       Node prev=null;
       while (t.next != null) {
        prev = t;
        t=t.next;
       }
       T num= t.data;
       if(prev != null){
        prev.next=null;
       }else{
        start=null;
       }
        return num;
    }

    public boolean searchNode(T key){
     Node t= start;
     while (t.next!= null) {
        if(t.data==key) return true;
        return false;
     }return false; 
    }

    public void printList() {
        Node t = start;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.insertAtStart(4); // Corrected the spelling mistake here
        list.insertAtEnd(5);
        list.insertAtStart(1);
        list.deleteNodeAtEnd();
        list.printList();
    }
}
