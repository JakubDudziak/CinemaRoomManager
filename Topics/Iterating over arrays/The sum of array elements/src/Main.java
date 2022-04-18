import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArray = new int[n];
        int sum = 0;
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = scanner.nextInt();
            sum += nArray[i];
        }
        System.out.println(sum);
    }
}