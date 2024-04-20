public class DoublyLinkedList<T> {
    class Node {
        Node prev;
        T data;
        Node next;
    }

    Node start = null;

    private boolean isEmpty() {
        return (start == null);
    }

    public void insertAtStart(T value) {
        Node n = new Node();
        n.prev = null;
        n.data = value;
        if (isEmpty()) {
            start = n;
            start.prev = null;
        } else {
            n.next = start;
            start = n;
        }

    }

    public void inserAtEnd(T value) {

        Node n = new Node();
        if (isEmpty()) {
            start = n;
            return;
        }
        n.data = value;
        n.next = null;

        Node t = start;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
        n.prev = t;

    }

    public T deleteAtStart(){
      if(isEmpty()){
        System.out.println("List is empty");
        return null;
      }else{
        T num = start.data;
        start=start.next;
        start.prev=null;
        return num;
      }
    }

    public T deleteAtEnd(){
        if(isEmpty()){
          System.out.println("List is empty");
          return null;
        }else{
            Node t= start;
            T num = start.data;
            Node currentNode =null;
          while (t.next != null) {
            currentNode=t;
            t=t.next;
          }
          currentNode.next = null;
          currentNode.prev= t.prev;
          return num;
        }
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
            System.out.print(t.data + " <--> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertAtStart(4);
        list.insertAtStart(6);
        list.inserAtEnd(10);
        list.deleteAtStart();
        System.out.println(list.searchNode(0));
        list.deleteAtEnd();
        list.printList();
    }
}
