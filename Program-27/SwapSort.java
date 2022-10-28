import java.util.*;
public class SwapSort {
    String wrd, swapwrd, sortwrd;
    int len;
    static Scanner sc = new Scanner(System.in);
    SwapSort() {
        swapwrd = "";
        sortwrd = "";
    }

    void readword() {
        System.out.println("Enter word in Upper case");
        wrd = sc.next();
        len = wrd.length();
    }

    void swapchar() {
        swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
    }

    void sortword() {
        char c;
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < len; j++) {
                c = wrd.charAt(j);
                if (c == i)
                    sortwrd += c;
            }
        }
    }

    void display() {
        System.out.println("Original word = " + wrd);
        System.out.println("Swapped word = " + swapwrd);
        System.out.println("Sorted word = " + sortwrd);
    }

    public static void main(String args[]) {
        SwapSort x = new SwapSort();
        x.readword();
        x.swapchar();
        x.sortword();
        x.display();
    }
}
