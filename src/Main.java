import java.util.Scanner;

public class Main {

    static void readArray(int[] arr, int index, Scanner sc) {
        if (index == arr.length) {
            return;
        }
        arr[index] = sc.nextInt();
        readArray(arr, index + 1, sc);
    }

    static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        readArray(arr, 0, sc);

        int total = sum(arr, n);
        double average = (double) total / n;

        System.out.println(average);
    }
}