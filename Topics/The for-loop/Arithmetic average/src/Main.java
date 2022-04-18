import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double numOfVar = 0;
        double sum = 0;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                //System.out.println(a);
                sum += a;
                numOfVar++;
            }
        }
        System.out.println(sum / numOfVar);
    }
}