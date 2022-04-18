import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= number; i++) {
            int a = scanner.nextInt();
            if (a % 4 == 0 && max <= a) {
                max = a;
            }
        }
        System.out.println(max);
    }
}