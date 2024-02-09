import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RadixSort {
    // Function to count the number of digits in a number
    static int count(int a) {
        int b = 1;
        while (a / 10 != 0) {
            a /= 10;
            b++;
        }
        return b;
    }

    // Function to extract a specific digit from a number
    static int count1(int a, int c) {
        int x = (int) Math.pow(10, c - 1);
        a /= x;
        return a % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Input the number of elements in the array
        int[] a = new int[n]; // Array to store the elements

        int b = 0; // Variable to store the maximum value

        // Input the array elements and find the maximum value
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b = Math.max(b, a[i]);
        }

        // Determine the number of digits in the maximum value
        int cnt = count(b);

        Queue<Integer>[] q = new LinkedList[10]; // Array of queues for each digit (0-9)

        for (int i = 0; i < 10; i++) {
            q[i] = new LinkedList<>();
        }

        // Perform radix sort
        for (int j = 1; j <= cnt; j++) {
            for (int i = 0; i < n; i++) {
                q[count1(a[i], j)].add(a[i]); // Distribute elements into queues based on current digit
            }

            int p = 0;
            // Collect elements from queues
            for (int k = 0; k < 10; k++) {
                while (!q[k].isEmpty()) {
                    a[p] = q[k].poll();
                    p++;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
