import java.util.Scanner;

class liczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }
}
