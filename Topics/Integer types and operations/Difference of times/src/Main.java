import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hourE = scanner.nextInt();
        int minutesE = scanner.nextInt();
        int secondsE = scanner.nextInt();
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds= scanner.nextInt();
        System.out.println((hour * 3600 + minutes * 60 + seconds) - (hourE * 3600 + minutesE * 60 + secondsE));
    }
}