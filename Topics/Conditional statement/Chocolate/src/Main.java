import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int cutPart = scanner.nextInt();
            if (cutPart % width == 0 && cutPart / width <= length ||
                    cutPart % length == 0 && cutPart / length <= width) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//width * (length -1) == cutPart || (width -1) * length == cutPart
//length == cutPart || width == cutPart ||