import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                if (count == n) {
                    break;
                }
                count++;
                System.out.print(i + " ");

            }
        }
    }
}