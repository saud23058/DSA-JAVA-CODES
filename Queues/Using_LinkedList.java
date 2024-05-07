package Queues;

public class Using_LinkedList<T> {
  class Node {
    T data;
    Node next;
  }

  Node start = null;

  private boolean isEmpty() {
    return (start == null);
  }

  public void enqueue(T value) {
    Node n = new Node();
    n.data = value;
    if (isEmpty()) {
      start = n;
      return;
    }
    Node t = start;
    while (t.next != null) {
      t = t.next;
    }
    t.next = n;
   
  }

  public T dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty ");
      return null;
    }
    T num = start.data;
    start = start.next;
    return num;
  }
  
  public void printQueue() {
    Node t = start;
    while (t != null) {
      System.out.print(t.data + "->");
      t = t.next;
    }
    System.out.println("NUll");
  }
  public static void main(String[] args) {
    Using_LinkedList<Integer> queue = new Using_LinkedList<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.dequeue();
    queue.printQueue();
  }
}
