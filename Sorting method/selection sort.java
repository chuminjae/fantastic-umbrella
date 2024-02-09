import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Perform selection sort
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            if (i != minIdx) {
                int temp = a[i];
                a[i] = a[minIdx];
                a[minIdx] = temp;
            }
        }
        
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
