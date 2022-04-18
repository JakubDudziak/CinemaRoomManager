import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        System.out.println(a % 2 == 0 ? a+2 : a+1);

//        int b = scanner.nextInt();
//        System.out.println(b/2*2+2);

    }
}