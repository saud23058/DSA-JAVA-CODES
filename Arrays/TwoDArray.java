package Arrays;
public class TwoDArray {
    private static void printAnArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
               System.out.println();
        }
    }

    private static void sumOfArrays(int[][] array1, int[][] array2) {
        int [][] res= new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.println("Result :");

        printAnArray(res);
    }
    public static void main(String[] args) {
int[][] array1 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int[][] array2 = {
    {9, 8, 7},
    {6, 5, 4},
    {3, 2, 1}
};

printAnArray(array1);

sumOfArrays(array1,array2);

    }
    
}
