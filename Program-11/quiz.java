import java.util.*;

public class quiz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Participants (N): ");
        int n = sc.nextInt();

        if (n <= 3 || n >= 11) {
            System.out.println("INPUT SIZE OUT OF RANGE.");
            return;
        }

        char answers[][] = new char[n][5];
        char key[] = new char[5];

        System.out.println("Enter answers of participants:-");
        for (int i = 0; i < n; i++) {
            System.out.println("Participant " + (i + 1));
            for (int j = 0; j < 5; j++) {
                answers[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Enter Answer Key: ");
        for (int i = 0; i < 5; i++) {
            key[i] = sc.next().charAt(0);
        }

        int hScore = 0;
        int score[] = new int[n];

        System.out.println("Scores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (answers[i][j] == key[j]) {
                    score[i]++;
                }
            }

            if (score[i] > hScore) {
                hScore = score[i];
            }

            System.out.println("Participant " + (i + 1) + " = " + score[i]);
        }

        System.out.println("Highest Score:");
        for (int i = 0; i < n; i++) {
            if (score[i] == hScore) {
                System.out.println("Participant " + (i + 1));
            }
        }
    }
}