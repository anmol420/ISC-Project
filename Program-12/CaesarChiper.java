import java.util.*;

public class CaesarChiper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text: ");
        String str = sc.nextLine();
        int len = str.length();

        if (len <= 3 || len >= 100) {
            System.out.println("INVALID LENGTH");
            return;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'M') || (ch >= 'a' && ch <= 'm')) {
                sb.append((char) (ch + 13));
            } else if ((ch >= 'N' && ch <= 'Z') || (ch >= 'n' && ch <= 'z')) {
                sb.append((char) (ch - 13));
            } else {
                sb.append(ch);
            }
        }

        String cipher = sb.toString();
        System.out.println("The cipher text is:");
        System.out.println(cipher);
    }
}