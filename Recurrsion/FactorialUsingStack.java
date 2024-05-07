package Recurrsion;

import java.util.Stack;

public class FactorialUsingStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    int n = 5;
    for (int i = n; i > 0; i--) {
      stack.push(i);
    }
    int re = 1;
    while (!stack.isEmpty()) {
      re *= stack.pop();
    }

    System.out.println("Factorial of  "+ n+" = "+re);

  }
}
