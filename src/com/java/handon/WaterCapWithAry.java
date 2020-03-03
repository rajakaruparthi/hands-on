package com.java.handon;

public class WaterCapWithAry {
    public static void main(String[] args) {
        int[] arry = {2,1,2,1,3,2,1,1,4};
        int[] arry2 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int waterQuantity = waterQuantity(arry);
        int water = waterQuantity(arry2);
        System.out.println(waterQuantity);
        System.out.println(water);
    }

    private static int waterQuantity(int[] arry) {
        int max = arry[0], count = 0, waterQuantity = 0;
        for (int i=1; i<arry.length; i++){
            count++;
            if(max <= arry[i] || i == arry.length-1){
                max = arry[i];
                int first = arry[i-count];
                System.out.println("first--"+first);
                for (int j=i-count; j<i; j++){
                    System.out.println(arry[j]);
                    waterQuantity = waterQuantity + first - arry[j];
                }
                count = 0;
                System.out.println("---------------");
            }
        }
        return waterQuantity;
    }
}
