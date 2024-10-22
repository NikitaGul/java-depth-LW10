package com.edu.chmnu.ki_123.c3;


import java.util.Arrays;

public class Main {

    public static int binarySearch(double[] array4, double key) {
        int left = 0, right = array4.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (key == array4[mid]) {
                return mid;
            } else if (key > array4[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        double[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int ind = binarySearch(array, 5);
        if(ind != -1) {
            System.out.println(ind);
        }
        else
        {
            System.out.println("Key not foun");
        }

        int ind1 = Arrays.binarySearch(array, 5);

        System.out.println(ind1);
    }
}