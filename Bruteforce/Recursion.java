public class Main {
    static boolean[] a = new boolean[11];
    static int[] aa = new int[2];
    static int cnt = 0;

    static void check(int c) {
        if (c == 2) {
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += aa[i];
            }
            if (sum == 13) {
                cnt++;
            }
        } else {
            for (int i = 0; i < 10; i++) {
                if (!a[i]) {
                    a[i] = true;
                    aa[c] = i;
                    check(c + 1);
                    a[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        check(0);
        System.out.println(cnt);
    }
}
