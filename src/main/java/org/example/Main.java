package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

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
    }
}