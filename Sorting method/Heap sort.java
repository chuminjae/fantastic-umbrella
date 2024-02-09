import java.util.Scanner;

public class HeapSort {
    static int[] a;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        n = scanner.nextInt();

        a = new int[n + 1]; // We add 1 to account for 1-based indexing

        // Construct the heap
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            int d = i;
            while (d > 1 && a[d / 2] < a[d]) {
                swap(d, d / 2);
                d = d / 2;
            }
        }

        // Heap sort
        for (int j = 1; j <= n; j++) {
            int i = 1;
            swap(i, n - j + 1);
            int cnt = n - j;
            while (true) {
                int h = 0, p = 0;
                if (i * 2 <= cnt && a[i] < a[i * 2]) {
                    h = a[i * 2];
                }
                if (i * 2 + 1 <= cnt && a[i] < a[i * 2 + 1]) {
                    p = a[i * 2 + 1];
                }
                if ((h > p) && (h != 0)) {
                    swap(i, i * 2);
                    i = i * 2;
                } else if ((h <= p) && (p != 0)) {
                    swap(i, i * 2 + 1);
                    i = i * 2 + 1;
                } else {
                    break;
                }
            }
        }

        // Print the sorted array
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Swap two elements in the array
    static void swap(int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
