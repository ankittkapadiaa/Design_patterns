package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "Green";
        colors[1] = "Yellow";
        colors[2] = "Blue";
        colors[3] = "Orange";
        colors[4] = "Red";
        System.out.println(Arrays.toString(colors));

        List<String> list = new ArrayList<String>();
        list.add(0, "BLUE");

        Set<String> set = new HashSet<>();
        System.out.println(set.size());
    }
}
