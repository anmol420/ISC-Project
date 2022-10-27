import java.util.*;

class Capital {
    String sent;
    int freq;

    Capital() {
        sent = "";
        freq = 0;
    }

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter one sentence");
            sent = sc.nextLine();
        }
    }

    boolean isCap(String w) {
        if (Character.isUpperCase(w.charAt(0)) == true)
            return true;
        else
            return false;
    }

    void display() {
        StringTokenizer str = new StringTokenizer(sent, " ");
        int ct = str.countTokens();
        for (int i = 0; i < ct; i++) {
            String word = str.nextToken();
            if (isCap(word) == true)
                freq++;
        }
        System.out.println(
                "In \"" + sent + "\"" + ".\nThe frequency of the words beginning with a capital letter is " + freq);
    }

    public static void main(String args[]) {
        Capital obj = new Capital();
        obj.input();
        obj.display();
    }
}