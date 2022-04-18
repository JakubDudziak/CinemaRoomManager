import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int digit = scanner.nextInt();
        int a = digit / 1000;
        int b = digit / 100 % 10;
        int c = digit / 10 % (a * 100 + b * 10);
        int d = digit % 10;
        if (a==d && b==c) {
            System.out.println(1);
        } else {
            System.out.println(digit);
        }
    }
}