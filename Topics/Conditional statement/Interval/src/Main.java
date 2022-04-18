import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int digit = scanner.nextInt();
        if (-15 < digit && digit <= 12 || digit > 14 && digit < 17 || digit >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}