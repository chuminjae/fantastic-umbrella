import java.util.Scanner;

public class Main {
    static String b;

    static void f(int a, int p) {
        if (a > p) return;

        System.out.print(b.charAt(a));
        f(a * 2, p);
        f(a * 2 + 1, p);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextLine();
        b = "0" + b;
        System.out.println(b);
        f(1, b.length() - 1);
    }
}
