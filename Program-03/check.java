import java.util.*;

public class check {
    public static void sen_check(String sen) {
        System.out.println(sen);
        StringTokenizer st = new StringTokenizer(sen, "? .!,");
        int count = st.countTokens();
        String a[] = new String[count];
        for (int i = 0; i < count; i++) {
            a[i] = st.nextToken();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].length() > a[j + 1].length()) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input: ");
            String sen = sc.nextLine();
            sen = sen.trim();
            sen = sen.toUpperCase();
            int len = sen.length();

            char last = sen.charAt(len - 1);
            if (last != '.' && last != '?' && last != '!') {
                System.out.println("INVALID INPUT");
                return;
            }
            System.out.println("Output: ");
            sen_check(sen);
        }
    }
}