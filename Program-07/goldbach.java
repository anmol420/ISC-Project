import java.util.*;

public class goldbach {
    public static boolean even(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean odd_prime(int n) {
        int k = 0, c = 0;
        if (n % 2 != 0) {
            k++;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (k == 1 && c == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.println();
        if (!even(n)) {
            System.out.println("Not a even number");
            return;
        }
        if (n < 9 || n > 50) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Output:\nPrime parts are:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) == n) {
                    if (odd_prime(i) && odd_prime(j)) {
                        System.out.println(i + "," + j);
                    }
                }
            }
        }
    }
}
