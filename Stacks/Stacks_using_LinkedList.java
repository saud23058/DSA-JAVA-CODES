package Stacks;

public class Stacks_using_LinkedList<T> {
    int size = 0;

    class Node {
        T data;
        Node next;

    }

    Node start = null;

    private boolean isEmpty() {
        return (start == null);
    }

    public void push(T value) {
        Node n = new Node();
        n.data = value;
        n.next = null;
        if (isEmpty()) {
            start = n;
        } else {
            n.next = start;
            start = n;
        }
        size++;

    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            T value = start.data;
            start = start.next;
            size--;
            return value;
        }
        
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }else{
            System.out.println(start.data);
            return;
        }
    } 

    public void printStack(){
        if (isEmpty()) {
             System.out.println("Stack is Empty");
             return;                 
     }else{
        Node t= start;
        while (t != null) {
            System.out.print(t.data +"  ");
            t=t.next;
        }
     }
    }
    public static void main(String[] args) {
   Stacks_using_LinkedList<Integer> stacks_using_LinkedList = new Stacks_using_LinkedList<>();
   stacks_using_LinkedList.push(10);
   stacks_using_LinkedList.push(12);
   stacks_using_LinkedList.pop();
   stacks_using_LinkedList.printStack();
   System.out.println("Size of Stack :"+stacks_using_LinkedList.size);
    }
}
