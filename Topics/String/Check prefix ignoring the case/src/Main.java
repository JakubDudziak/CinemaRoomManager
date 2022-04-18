import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String a = scanner.nextLine();

        if (a.startsWith("J") == true || a.startsWith("j") == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}