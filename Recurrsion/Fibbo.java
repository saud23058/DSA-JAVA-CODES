package Recurrsion;
public class Fibbo {
  public static int fib(int value) {
    if (value <= 1) {
      return value;
    }

    return fib(value - 1) + fib(value - 2);
  }

  public static void printFib(int n){
    if(n>=10){
      return;
    }
    System.out.println(n+" --->"+fib(n));
    printFib(n+1);
  }

  public static void main(String[] args) {
   printFib(1);
  }
}
