package org.dev;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //PLUS MINUS TEST
        List<Integer> array = new ArrayList<>();
        array.add(-4);
        array.add(3);
        array.add(-9);
        array.add(0);
        array.add(4);
        array.add(1);

        PlusMinus.plusMinus(array);

        //MINUS-MAX SUM TEST
        List<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.add(4);
        array2.add(5);

        MinMaxSum.miniMaxSum(array2);


    }
}