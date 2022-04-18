import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long firstVal = scanner.nextLong();
        System.out.println();
        String sign = scanner.next();
        long secondVal = scanner.nextLong();

//        BigInteger firstVal = new BigInteger.valueOf();
//        BigInteger secondVal = new BigInteger.valueOf(Integer.parseInt(m));


        switch (sign) {
            case "+":
                System.out.println(firstVal + secondVal);
                break;
            case "-":
                System.out.println(firstVal - secondVal);
                break;
            case "/":
                if (secondVal != 0){
                    System.out.println(firstVal / secondVal);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            case "*":
                System.out.println(firstVal * secondVal);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}