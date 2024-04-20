package Arrays;

public class BaseAddress {
    public static void main(String[] args) {
        int row=3,col=3;
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int base=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                base=((i*col+j)*4)+100; 
                System.out.println("Memory address of array1[" + i + "][" + j + "]: " + base);
            }
        }

        System.out.println("for col major  base");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                base=((j*row+i)*4)+100; 
                System.out.println("Memory address of array1[" + i + "][" + j + "]: " + base);
            }
        }

}
}