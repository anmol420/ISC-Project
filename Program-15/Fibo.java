import java.util.*;

class Fibo {
    int start, end;

    public Fibo() {
        start = end = 0;
    }

    public void read() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter start and end value: ");
            start = sc.nextInt();
            end = sc.nextInt();
        }
    }

    public int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public void display() {
        for (int i = start; i < end; i++) {
            int p = fibo(i);
            if (p >= start && p <= end)
                System.out.print(fibo(i) + " ");
        }
    }

    public static void main(String args[]) {
        Fibo Ob = new Fibo();
        Ob.read();
        Ob.display();
    }
}