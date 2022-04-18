import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] xArray= new int[n][n];
        int right = 0;
        int left = 0;
        for (int i = 0; i < xArray.length; i ++) {
            left = i;
            for (int j = 0; j < xArray.length; j++) {
                if (i <= j) {
                    xArray[i][j] = right;
                    System.out.print(xArray[i][j] + " ");
                    right++;
                } else if (i > j) {

                    xArray[i][j] = left;
                    System.out.print(xArray[i][j] + " ");
                    left--;
                }
            }
            right = 0;
            System.out.println();
        }
    }
}