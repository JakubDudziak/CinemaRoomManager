import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int digit = scanner.nextInt();
        boolean a = digit < 10;
        System.out.println(a);
    }
}