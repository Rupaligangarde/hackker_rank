package sockMerchant;

import java.io.*;
import java.util.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        int noOfPairs = 0;

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int currentColor = ar[i];
            Integer sameColor = pairs.get(currentColor);

            if (sameColor != null && sameColor != 0) {
                pairs.put(currentColor, sameColor + 1);
            } else
                pairs.put(currentColor, 1);
        }


        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            if (entry.getValue() >= 2) {
                noOfPairs += entry.getValue() / 2;
            }
        }

        return noOfPairs;
    }


    public static void main(String[] args) throws IOException {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(9, ar);
        System.out.println(result);
    }
}
