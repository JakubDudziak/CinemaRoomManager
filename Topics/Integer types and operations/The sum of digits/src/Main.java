import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int digit = scanner.nextInt();
        System.out.println((digit / 100  % 100) + ((digit / 10)  % 10) + (digit % 10));
    }
}