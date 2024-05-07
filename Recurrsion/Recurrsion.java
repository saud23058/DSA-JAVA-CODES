package Recurrsion;


class Recurrsion {
  public static int factorial(int value){
  if(value == 1)
   return 1;
    return value*factorial(value-1);
  }

  public static void main(String[] args) {
    System.out.println("Result : "+factorial(5));
  }
}