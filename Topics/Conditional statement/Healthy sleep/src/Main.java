import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        if (A <= H && B >= H) {
            System.out.println("Normal");
        } else if (A >= H) {
            System.out.println("Deficiency");
        } else if (B <= H) {
            System.out.println("Excess");
        }
    }
}