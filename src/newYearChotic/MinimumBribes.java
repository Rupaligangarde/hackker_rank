package newYearChotic;

import java.util.Scanner;

public class MinimumBribes {

    static void minimumBribes(int[] q) {

        int bribe = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) bribe++;

        }

        System.out.println(bribe);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] q = {2, 1, 5, 3, 4};

        minimumBribes(q);

    }
}
