import java.util.Arrays;
import java.util.Scanner;

public class Ex65 {
    public static int Split(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (a[j] < pivot) {
                i++;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        int tmp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = tmp;
        
        return i + 1;
    }

    public static void QuickSort(int[] a, int l, int r) {
        if (l < r) {
            int pivot = Split(a, l, r);
            QuickSort(a, l, pivot - 1);
            QuickSort(a, pivot + 1, r);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        QuickSort(a, 0, n - 1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double avg = (double)sum / n;

        System.out.println("The sorted array is: " + Arrays.toString(a));
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + avg);
        
        sc.close();
        System.exit(0);
    }
}