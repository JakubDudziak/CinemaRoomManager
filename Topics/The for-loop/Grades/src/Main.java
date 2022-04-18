import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        scanner.nextLine();
        int aAmount = 0;
        int bAmount = 0;
        int cAmount = 0;
        int dAmount = 0;
        for (int i = 1; i <= n; i++) {

            String grade = scanner.nextLine();

            if (grade.equals("A")) {
               aAmount++;
            } else if (grade.equals("B")) {
                bAmount++;
            } else if (grade.equals("C")) {
                cAmount++;
            } else if (grade.equals("D")){
                dAmount++;
            }

        }

        System.out.println(dAmount + " " + cAmount + " " + bAmount + " " + aAmount + " " );

    }
}