import java.util.Arrays;

public class HW18Matrix02 {
    public static void main(String[] args) {

        int[][] arr2D = new int[8][8];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i % 2 == 0) {
                    arr2D[i][j] = j + 1;

                    }else {
                    arr2D[i][j] = arr2D[i].length-j;

                }
            }

        }
        for (int i = 0; i < arr2D.length; i++) {
             System.out.println(Arrays.toString(arr2D[i]));
            }


        }
    }
