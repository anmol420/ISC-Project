import java.util.*;

public class Shift {
    static Scanner sc = new Scanner(System.in);
    int mat[][];
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        System.out.println("Enter elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        System.out.println();
        System.out.println("Output:");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
        }
    }

    void cyclic(Shift P) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0)
                    mat[i - 1][j] = P.mat[i][j];
                else
                    mat[m - 1][j] = P.mat[0][j];
            }
        }
    }

    public static void main() {
        Shift x = new Shift(3, 4);
        Shift y = new Shift(3, 4);
        x.input();
        y.cyclic(x);
        x.display();
        y.display();
    }
}