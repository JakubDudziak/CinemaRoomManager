import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int amount = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            int digit = scanner.nextInt();
            if (digit % 6 == 0) {
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}