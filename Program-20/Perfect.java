import java.util.*;

class Perfect {
    private int num;

    public Perfect(int nn) {
        num = nn;
    }

    public int sum_of_factors(int i) {
        int f = 1;
        if (i == f) {
            return 0;
        } else if (i % f == 0) {
            return f++ + sum_of_factors(i);
        } else {
            f++;
            return sum_of_factors(i);
        }
    }

    public void check() {
        if (num == sum_of_factors(num))
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            Perfect obj = new Perfect(n);
            obj.check();
        }
    }
}