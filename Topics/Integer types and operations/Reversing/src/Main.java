import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        System.out.println((((a % 10) * 100) + ((a / 10 ) % 10) * 10) + (a /100));
    }
}