import java.util.Arrays;

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int[][][] cube = new int[3][3][3];
        int element = 0;

        for (int i = 0; i < cube.length; i++) { // rząd
            for (int j = 0; j < cube.length; j++) { // kolumna
                for (int k = 0; k < cube.length; k++) {
                    cube[i][j][k] = element;
                    element++;
                   // System.out.print(cube[i][j][k] + ", ");
                }

            }
            element = 0;
        }
        return cube;
    }
}