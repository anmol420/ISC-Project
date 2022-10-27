import java.util.*;

class Check {
    String wrd;
    int len;

    public Check() {
        wrd = "";
        len = 0;
    }

    public void acceptword() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a word:");
            wrd = sc.next();
        }
        len = wrd.length();
    }

    public boolean palindrome() {
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            if (wrd.charAt(i) != wrd.charAt(j))
                return false;
        }
        return true;
    }

    public void display() {
        System.out.print(wrd);
        if (palindrome())
            System.out.println(" is a Palindrome word");
        else
            System.out.println(" is not a Palindrome word");
    }

    public static void main(String args[]) {
        Check ob = new Check();
        ob.acceptword();
        ob.display();
    }
}