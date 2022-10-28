import java.util.Scanner;

class Toggle {
    String str, newstr;
    int len;

    public Toggle() {
        str = newstr = " ";
        len = 0;
    }

    public void readword() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a word:");
            str = sc.next();
        }
        len = str.length();
    }

    public void toggle() {
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                newstr += Character.toLowerCase(c);
            else
                newstr += Character.toUpperCase(c);
        }
    }

    public void display() {
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newstr);
    }

    public static void main(String args[]) {
        Toggle Ob = new Toggle();
        Ob.readword();
        Ob.toggle();
        Ob.display();
    }
}