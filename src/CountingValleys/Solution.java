package CountingValleys;

import java.io.IOException;

public class Solution {

    static int countingValleys(int n, String s) {

        int level=0, count = 0;

        char[] steps = s.toCharArray();
        for (char step : steps) {
            if(step=='D')
                --level;
            if(step=='U')
                ++level;

            if(level==0 && step=='U')
                count++;
        }
        return count;

    }


    public static void main(String[] args) throws IOException {

        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int result = countingValleys(steps, path);
        System.out.println(result);
    }
}
