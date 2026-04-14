import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the width: ");
        int n = sc.nextInt();
        System.out.println("Input the length: ");
        int m = sc.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        System.out.println("Input the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Final matrix:");
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        sc.close();
        System.exit(0);
    }
}  