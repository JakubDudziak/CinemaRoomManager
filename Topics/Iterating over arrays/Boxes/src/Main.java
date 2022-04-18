import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }
        int[] box2 = new int[3];
        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);
        int counterA = 0;
        int counterB = 0;
        for (int i = 0; i <= 2; i++) {
            if (box1[i] > box2[i]) {
                counterA++;
            } else if (box1[i] < box2[i]) {
                counterB++;
            }
        }
//        System.out.println(counterA);
//        System.out.println(counterB);
//        System.out.println(Arrays.toString(box1));
//        System.out.println(Arrays.toString(box2));
        if (counterA == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (counterB == 3) {
            System.out.println("Box 1 < Box 2");
        } else if (counterA < 3 && counterB < 3){
            System.out.println("Incompatible");
        }
    }
}