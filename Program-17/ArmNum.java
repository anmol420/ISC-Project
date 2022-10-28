import java.util.*;

class ArmNum {
    int n;
    int l;

    public ArmNum(int num) {
        n = num;
        l=0;
        for (int c = n; c != 0; c /= 10)
            l++;
    }

    public int sum_pow(int i) {
        if (i < 10)
            return (int) Math.pow(i, l);
        return (int) Math.pow(i % 10, l) + sum_pow(i / 10);
    }

    public void isArmstrong() {
        if (n == sum_pow(n))
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            ArmNum obj = new ArmNum(num);
            obj.isArmstrong();
        }
    }
}