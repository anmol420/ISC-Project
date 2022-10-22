import java.util.*;
public class sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF M: ");
        int m = sc.nextInt();
        System.out.print("ENTER THE VALUE OF N: ");
        int n = sc.nextInt();

        if (m <= 2 || m >= 10 || n <= 2 || n >= 10) {
            System.out.println("MATRIX SIZE OUT OF RANGE.");
            return;
        }

        int a[][] = new int[m][n];
        System.out.println("ENTER ELEMENTS OF MATRIX:");
        for (int i = 0; i < m; i++) {
            System.out.println("ENTER ELEMENTS OF ROW " + (i+1) + ":");
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int t = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = t;
                    }
                } 
            }
        }
        
        System.out.println("MATRIX AFTER SORTING ROWS");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}