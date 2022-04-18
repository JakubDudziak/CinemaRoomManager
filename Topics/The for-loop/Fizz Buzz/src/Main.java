import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // start coding here
        int beg = scanner.nextInt();
        int end = scanner.nextInt();
        for (; beg <= end; beg++) {
            if (beg % 3 == 0 && beg % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (beg % 5 == 0) {
                System.out.println("Buzz");
            } else if (beg % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(beg);
            }
        }

    }
}
