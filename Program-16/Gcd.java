import java.util.*;

class GCD {
    int num1, num2;

    public GCD() {
        num1 = num2 = 0;
    }

    public void accept() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
    }

    public int gcd(int x, int y) {
        int c = x % y;
        if (c == 0)
            return y;
        else {
            x = y;
            y = c;
            return gcd(x, y);
        }
    }

    public void display() {
        int temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(gcd(num1, num2));
    }

    public static void main(String args[]) {
        GCD Ob = new GCD();
        Ob.accept();
        Ob.display();
    }
}
