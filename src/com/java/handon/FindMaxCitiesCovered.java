package com.java.handon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMaxCitiesCovered {

    public static void main(String[] args) {
        int[] l = {0,0,2,1,3,4,0,5,0,0,0};
        findMaxCities(l);
    }

    private static void findMaxCities(int[] l) {
        int[][] connections = new int[l.length][2];
        List<int[]> startPoint = new ArrayList<>();
        startPoint.remove(1);
        for (int i=1; i< l.length; i++){
            connections[i][0] = l[i];
            connections[i][1] = i;
            if(connections[i][0] == 0){
                startPoint.add(connections[i]);
            }
        }

        int count;

        for (int i=0; i<startPoint.size();i++){
            count = 0;
            Map<String, Integer>  startToMaxCitiesMap = new HashMap<>();
            if(startPoint.get(i)[1]%2 != 0)
                count++;

            for (int j=1; j<l.length;j++){
                
            }
        }
    }


}
