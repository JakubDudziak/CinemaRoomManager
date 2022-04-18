import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer digit = scanner.nextInt();
        boolean a = digit < 10 && digit > 0;
        System.out.println(a);
    }
}