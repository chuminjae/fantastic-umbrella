import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        int cnt = 0;
        int k = n;
        for (int i = 0; i < n; i++) {
            cnt += a[i] * k;
            k--;
        }

        System.out.println(cnt);
    }
}
