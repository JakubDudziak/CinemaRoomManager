import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = 0;
        int num;

        do {
            num = scanner.nextInt();
            max = num > max ? num : max;
        } while (num != 0);
        System.out.println(max);
    }
}