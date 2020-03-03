package com.java.handon;

// diff between two arrays
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiffTwoArrays {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
                22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
        int[] a2 = {1,2,3,4,7};
        DiffTwoArrays diff = new DiffTwoArrays();
        List<Integer> diff1 = diff.difference(a1, a2);
        System.out.println(diff1);
        List<Integer> diff2 = diff.difference(a2, a1);
        System.out.println(diff2);
    }

    private List<Integer> difference(int[] a1, int[] a2) {
        int size1 = a1.length;
        int size2 = a2.length;
        List<Integer> unMatched = new ArrayList<>();
        int match = 0;
        Date dt= new Date();
        long start = dt.getTime();
        System.out.println(start);

       for(int i=0; i< size1; i++) {
           match = 0;
           for(int j=0; j< size2; j++){
               if(a1[i] == a2[j]){
                   match = 1;
                   break;
               }
           }
           if(match == 0){
                unMatched.add(a1[i]);
           }
       }

       long end = dt.getTime();
        System.out.println(end - start);
        return unMatched;
    }
}
