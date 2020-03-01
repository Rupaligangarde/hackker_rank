package hourglassSum;

import java.io.IOException;

public class HourglassSum {

    static int hourglassSum(int[][] arr) {


        int sum = -100;
        for (int row = 0; row < arr.length - 2; row++) {
            for (int column = 0; column < arr.length - 2; column++) {
                int result =
                        arr[row][column] + arr[row][column + 1] + arr[row][column + 2]
                                + arr[row + 1][column + 1]
                                + arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];
                if (result > sum)
                    sum = result;
            }
        }
        return sum;

    }


    public static void main(String[] args) throws IOException {

        int[][] arr = {
//                {-9, -9, -9, 1, 1, 1},
//                {0, -9, 0, 4, 3, 2},
//                {-9, -9, -9, 1, 2, 3},
//                {0, 0, 8, 6, 6, 0},
//                {0, 0, 0, -2, 0, 0},
//                {0, 0, 1, 2, 4, 0}

                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
