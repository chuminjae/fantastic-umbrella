import java.util.Scanner;

public class Main {
    static int[] a = new int[1001];

    static void swap(int[] a, int x, int y) {
        int p = a[x];
        a[x] = a[y];
        a[y] = p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a[0] = 1000001;
        int n = scanner.nextInt();
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            a[cnt] = scanner.nextInt();
            int d = cnt;
            while (a[d / 2] < a[d] && d >= 1) {
                swap(a, d, d / 2);
                d = d / 2;
            }
            cnt++;
        }
        System.out.println(a[1]);
    }
}
