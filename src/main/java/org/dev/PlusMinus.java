package org.dev;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        int size = arr.size();

        DecimalFormat format = new DecimalFormat("0.000000");

        for(int number : arr) {
            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.println(format.format((double)positives/size));
        System.out.println(format.format((double)negatives/size));
        System.out.println(format.format((double)zeros/size));

    }
}
