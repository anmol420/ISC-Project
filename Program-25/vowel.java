import java.util.*;
public class vowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE:");
        String ipStr = sc.nextLine().trim().toUpperCase();
        int len = ipStr.length();
        
        char lastChar = ipStr.charAt(len - 1);
        if (lastChar != '.' 
            && lastChar != '?' 
            && lastChar != '!') {
                System.out.println("INVALID INPUT");
                return;
        }
        
        String str = ipStr.substring(0, len - 1);
        
        StringTokenizer st = new StringTokenizer(str);
        StringBuffer sbVowel = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        int c = 0;
        
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLen = word.length();
            if (isVowel(word.charAt(0))
                && isVowel(word.charAt(wordLen - 1))) {
                    c++;
                    sbVowel.append(word);
                    sbVowel.append(" ");
            }
            else {
                sb.append(word);
                sb.append(" ");
            }
        }
        
        String newStr = sbVowel.toString() + sb.toString();
                            
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + c);
        System.out.println(newStr);
    }
    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        boolean ret = false;
        if (ch == 'A'
            || ch == 'E'
            || ch == 'I'
            || ch == 'O'
            || ch == 'U')
            ret = true;
            
        return ret;
    }
}