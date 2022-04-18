import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstName = scanner.nextLine();
        int yof = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();

        System.out.println("The form for " + firstName +
                " is completed. We will contact you if we need a chef who cooks " +
                a + " dishes and has " + yof + " years of experience.");
    }
}
