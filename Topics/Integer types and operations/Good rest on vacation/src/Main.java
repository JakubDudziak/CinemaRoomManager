import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int costOfOneNight= scanner.nextInt();
        System.out.println(flightCost * 2 + duration * foodCost + (duration -1) * costOfOneNight);
    }
}