import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        for (;;) {
            int a = scanner.nextInt();
            if (a == 0 && sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (a == 0) {
                System.out.println(sum);
                break;
            } else if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
            sum += a;
        }
    }
}