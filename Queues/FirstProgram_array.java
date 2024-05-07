package Queues;

public class FirstProgram_array<T> {
  T[] arr = (T[]) new Object[5];

  int head = 0, tail = -1;

  private boolean isFull() {
    return (tail >= arr.length - 1);
  }

  private boolean isEmpty() {
    return (head > tail);
  }

  public void enqueue(T value) {
    if (isFull()) {
      System.out.println("Queue is Fulled");
      return;
    }
    arr[++tail] = value;
  }

  public T dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return null;
    }
    return arr[head++];
  }

  public void printQueue() {
    while (head <= tail) {
      System.out.print(arr[head++] + " ");
    }
  }

  public int size() {
    return (tail - head) + 1;
  }

  public static void main(String[] args) {
    FirstProgram_array<Integer> queue = new FirstProgram_array<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.dequeue();
    queue.dequeue();
    System.out.println("Size : " + queue.size());
    queue.printQueue();
  }

}
