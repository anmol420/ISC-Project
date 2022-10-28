import java.util.*;
public class rearrange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER MATRIX SIZE (M): ");
        int m = sc.nextInt();

        if (m <= 3 || m >= 10) {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
            return;
        }

        int a[][] = new int[m][m];

        System.out.println("ENTER ELEMENTS OF MATRIX");
        for (int i = 0; i < m; i++) {
            System.out.println("ENTER ROW " + (i+1) + ":");
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 0) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }
        
        System.out.println("ORIGINAL MATRIX");
        printMatrix(a, m);
        
        sortNonBoundaryMatrix(a, m);
        System.out.println("REARRANGED MATRIX");
        printMatrix(a, m);
        
        computePrintDiagonalSum(a, m);
    }

    public static void sortNonBoundaryMatrix(int a[][], int m) {
        int b[] = new int[(m - 2) * (m - 2)];
        int k = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                b[k++] = a[i][j];
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;
                }
            } 
        }

        k = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                a[i][j] = b[k++];
            }
        }
    }

    public static void computePrintDiagonalSum(int a[][], int m) {
        int sum = 0;
        System.out.println("DIAGONAL ELEMENTS");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m - 1) {
                    sum += a[i][j];
                    System.out.print(a[i][j] + "\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
    }

    public static void printMatrix(int a[][], int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}