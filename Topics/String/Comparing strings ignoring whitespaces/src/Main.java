import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        a = a.trim().replace(" ", "");
        b = b.trim().replace(" ", "");;
//        System.out.println(a);
//        System.out.println(b);
        if (a.equalsIgnoreCase(b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}