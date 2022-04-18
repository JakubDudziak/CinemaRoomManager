import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int numberOfCups = scanner.nextInt();
        boolean itIsWeekend = scanner.nextBoolean();
        boolean party = numberOfCups >= 10 && numberOfCups <= 20 && itIsWeekend == false ||
                numberOfCups >= 15 && numberOfCups <= 25 && itIsWeekend == true;
        System.out.println(party);

    }
}