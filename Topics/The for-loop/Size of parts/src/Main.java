import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int amount = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < amount; i++) {
            int part = scanner.nextInt();
            if (part > 0) {
                larger++;
            } else if (part == 0) {
                perfect++;
            } else {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}