import java.util.Scanner;

public class Main {

    static int countChars(String s, int index) {

        if (index == s.length()) {
            return 0;
        }

        return 1 + countChars(s, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(countChars(s, 0));

    }
}