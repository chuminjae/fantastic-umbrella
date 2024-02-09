import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100000];

        // Input and count occurrences of each element
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            a[x]++;
        }

        // Print the sorted array
        for (int i = 0; i < 100000; i++) {
            while (a[i] != 0) {
                System.out.println(i);
                a[i]--;
            }
        }
    }
}
