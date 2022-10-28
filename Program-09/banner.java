import java.util.*;

public class banner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 2 || n >= 9) {
            System.out.println("INVALID INPUT");
            return;
        }

        String teams[] = new String[n];
        int highLen = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Team " + (i + 1) + ": ");
            teams[i] = sc.nextLine();
            if (teams[i].length() > highLen) {
                highLen = teams[i].length();
            }
        }

        for (int i = 0; i < highLen; i++) {
            for (int j = 0; j < n; j++) {
                int len = teams[j].length();
                if (i >= len) {
                    System.out.print(" \t");
                } else {
                    System.out.print(teams[j].charAt(i) + "\t");
                }
            }
            System.out.println();
        }
    }
}