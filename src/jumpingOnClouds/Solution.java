package jumpingOnClouds;

import java.io.IOException;

public class Solution {

    static int jumpingOnClouds(int[] c) {
        int jumps = -1;
        int n = c.length;
        for (int i = 0; i < n; i++) {
            if (i < n - 2 && c[i + 2] == 0) {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) throws IOException {

        int[] c = {0, 0, 1, 0, 0, 1, 0};

        int result = jumpingOnClouds(c);
        System.out.println(result);

    }
}
