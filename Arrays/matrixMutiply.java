package Arrays;

import java.util.Scanner;

public class matrixMutiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the first matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int n = scanner.nextInt();
        int[][] a1 = new int[m][n];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter the number of rows for the second matrix: ");
        int p = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int q = scanner.nextInt();
        int[][] a2 = new int[p][q];
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                a2[i][j] = scanner.nextInt();
            }
        }

        if (n != p) {
            System.out.println("Matrices cannot be multiplied.");
        } else {
            int[][] res = new int[m][q];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        res[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }

            System.out.println("The resultant matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();

            }
        }
        
    

