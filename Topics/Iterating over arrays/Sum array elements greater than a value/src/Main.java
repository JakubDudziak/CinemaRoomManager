import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int sum = 0;
        for (int digit : nArray) {
            if (digit > k) {
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}