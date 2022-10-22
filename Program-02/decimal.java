import java.util.*;
public class decimal {
    public static void dec_con(int a[][],int m,int n) {
        System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");
        for (int i = 0; i < m; i++) {
            int decNum = 0;
            for (int j = 0; j < n; j++) {
                decNum += a[i][j] * Math.pow(8, n - j - 1 );
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\t\t" + decNum);
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int n = sc.nextInt();
        
        if (m <= 0 || m >= 10 || n <= 2 || n >= 6) {
            System.out.println("OUT OF RANGE");
            return;
        }
        
        int a[][] = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            System.out.println("ENTER ELEMENTS FOR ROW " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 0 || a[i][j] > 7) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }

        dec_con(a,m,n);
    }
}