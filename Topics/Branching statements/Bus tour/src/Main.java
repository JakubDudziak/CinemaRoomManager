import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int height = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        for (int i = 1; i <= numOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight > height && i == numOfBridges) {
                System.out.println("Will not crash");
            } else if (bridgeHeight <= height){
                System.out.println("Will crash on bridge " + i);
                break;
            } else {
                continue;
            }

        }

    }
}