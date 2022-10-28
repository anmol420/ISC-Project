import java.util.*;

public class prime_adam {
    public static boolean isPrime(int x) {
        int c = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }
        return false;
    }

    public static int reverse(int n) {
        int rev = 0, d = 0;
        while (n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }

    public static boolean isAdam(int n) {
        int s1 = n * n;
        int rev = reverse(n);
        int s2 = rev * rev;
        int r = reverse(s2);

        return r == s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        if (m >= n) {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;

        System.out.println("Prime Adam Numbers Are: ");
        for (int i = m; i <= n; i++) {
            if (isAdam(i) && isPrime(i)) {
                System.out.println(i + "\t");
                count++;
            }
        }
        System.out.println("Frequency: " + count);

        if (count == 0) {
            System.out.println("Nil");
        }
    }
}