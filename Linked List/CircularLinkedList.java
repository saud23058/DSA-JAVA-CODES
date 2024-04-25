public class CircularLinkedList <T>{
    class Node{
     Node prev;
     T data;
     Node next;
    }

    Node start = null;
    
    
    private boolean isEmpty(){
        return (start==null);
    }


    public void insertAtStart(T value){
        Node n = new Node();
        n.data = value;
        n.prev = null;
        if(isEmpty())
        start=n;
        else{
           n.next = start;
           start.prev=n.prev;
           

        }
    }



    public void printList(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }else{
            Node t = start;

            while (t != start.prev) {
                System.out.println(t.data+" ");
                t=t.next;
            }
        }
    }


    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.insertAtStart(10);
        circularLinkedList.insertAtStart(20);
        circularLinkedList.insertAtStart(30);
        circularLinkedList.printList();
    }
}
