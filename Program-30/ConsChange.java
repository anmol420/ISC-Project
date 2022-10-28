import java.util.*;

public class ConsChange {
    String word;
    int len;
    static Scanner sc = new Scanner(System.in);

    ConsChange() {
        len=0; 
        word= ""; 
    }

    void readword() {
        System.out.println("Enter word in Lower case");
        word = sc.next();
        len = word.length();
    }

    void shiftcons() {
        String s = "";
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                s += c;
        }
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                s += c;
        }
        System.out.print("\n Sorted Word=" + s);
        word = s;
    }

    void changeword() {
        char c;
        String s = "";
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                s += (char) (c - 32);
            else
                s += c;
        }
        System.out.println("\n Changed word= " + s);
    }

    void show() {
        System.out.print("\n Original word= " + word);
        shiftcons();
        changeword();
    }

    static void main() {
        ConsChange X = new ConsChange();
        X.readword();
        X.show();
    }
}