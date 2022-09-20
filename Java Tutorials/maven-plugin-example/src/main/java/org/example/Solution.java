package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxContainer(int[] height){
        /*
        1. Get all values(index * value and put in array use ArrayList so it can dynamic expand array
        2. Sort array to get max value
         */

        List<Integer> containers = new ArrayList<Integer>();
        for(int i=0;i<height.length;i++){
            for (int j=0;j<height.length;j++){
                containers.add((j+1)*height[j]);
            }
        }

        return containers.size();
    }
}
