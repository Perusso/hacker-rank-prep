package org.dev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;

        Collections.sort(arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
            maxSum += arr.get(i + 1);
        }

        System.out.println(minSum + " " + maxSum);
    }
}
