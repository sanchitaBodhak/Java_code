package Sorting;

import java.util.Arrays;

//majority element is the element which appears more than n/2 times in an array
public class Majority_element_leetcode169 {
    public static void main(String[] args) {
        int[] arr = {1,1,21,2,2,3,3,3,3,3};
        Arrays.sort(arr);
        int major = arr[arr.length/2];
        System.out.println(" the majority element is.." + major);
    }
}
