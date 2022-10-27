import java.io.*;
import java.util.Scanner;

class EqMat {
    private int a[][];
    private static int m;
    private static int n;

    public EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[m][n];
    }

    public void readArray() throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
        }
    }

    public static boolean check(EqMat p, EqMat q) {
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (p.a[i][j] != q.a[i][j])
                    return false;
            }
        }
        return flag;
    }

    public void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Number of columns: ");
            int columns = sc.nextInt();
            EqMat obj1 = new EqMat(rows, columns);
            EqMat obj2 = new EqMat(rows, columns);
            System.out.println("Enter elements for first matrix:");
            obj1.readArray();
            System.out.println("Enter elements for second matrix:");
            obj2.readArray();
            System.out.println("First Matrix:");
            obj1.print();
            System.out.println("Second Matrix:");
            obj2.print();
            if (check(obj1, obj2))
                System.out.println("Both Matrices are Equal");
            else
                System.out.println("Matrices are not Equal");
        }
    }
}