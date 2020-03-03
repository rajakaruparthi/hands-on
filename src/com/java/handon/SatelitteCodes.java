package com.java.handon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SatelitteCodes {

    public static void main(String[] args) {
        String[] st1 = {"x", "x", "xy", "yx", "xyz", "xy", "zyx", "xz", "123", "321", "pxyz"};


        String[] st = {"x", "xy", "yz", "xyz", "zy", "x", "xy", "yx"};
        List<String> uniqueCodes = new ArrayList<>(new HashSet<>(Arrays.asList(st)));
        for (String each : uniqueCodes) {
            System.out.print(each + " ,");
        }
        System.out.println();
        for (int i = 0; i < uniqueCodes.size(); i++) {
                String temp = new StringBuilder(uniqueCodes.get(i)).reverse().toString();
                if (temp.length() > 1 && uniqueCodes.contains(temp)) {
                    uniqueCodes.remove(i);
                }
        }
        List<String> codes = new ArrayList<>(Arrays.asList(st));

        for (int i = 0; i < codes.size(); i++) {
            for (int j = 1; j < codes.size(); j++) {
                if (i != j) {
                    if (codes.get(i).equals(codes.get(j))) {
                        codes.remove(j);
                    }
                }
            }
        }

        System.out.println("codes--->");
        for (String each : codes) {
            System.out.print(each + " ,");
        }
        for (String each : uniqueCodes) {
            System.out.print(each + " ,");
        }
    }
}
