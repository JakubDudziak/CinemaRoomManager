import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = scanner.nextInt();
        }
        Arrays.sort(nArray);
        System.out.println(nArray[0]);
    }
}