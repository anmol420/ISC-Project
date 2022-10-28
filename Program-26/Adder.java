import java.util.Scanner;
class adder {
    private int a[];
    public adder() {  
        a = new int[2];
    }
    public void readtime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours");
        a[0]=sc.nextInt();
        System.out.println("Enter Minutes");
        a[1]=sc.nextInt();
    }
    public void addtime(adder X,adder Y) {
        int a,b,c;
        a=(X.a[0]*60)+X.a[1];
        b=(Y.a[0]*60)+Y.a[1];
        c=a+b;
        this.a[0]=c/60;
        this.a[1]=c%60;
    }
    void displaytime() {
        System.out.println(a[0]+" Hours "+a[1]+" Minutes");
    }
}
public class Adder {
    public static void main(String args[]) {
        adder obj1 = new adder();
        adder obj2 = new adder();
        adder obj3 = new adder();
        System.out.print("1st Time ");
        obj1.readtime();
        System.out.print("2nd Time ");
        obj2.readtime();
        obj3.addtime(obj1,obj2);
        System.out.println("\n\n1st Time");
        obj1.displaytime();
        System.out.println("2nd Time");
        obj2.displaytime();
        System.out.println("Added Time");
        obj3.displaytime();
    }
}