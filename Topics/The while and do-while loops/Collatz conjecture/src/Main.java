import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        while (n >= 1){
            if (n % 2 != 0 && n != 1) {
                System.out.print(n + " ");
                n = n * 3 + 1;
            } else {
                System.out.print(n + " ");
                n /= 2;
            }
        }
    }
}