package com.java24hours;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.util.Arrays.sort;

class PosNeg {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        
        sort(arr);
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length - 1; i++){
            minSum += arr[i];
        }
        for (int i = 1; i < arr.length; i++){
            maxSum += arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }
}
