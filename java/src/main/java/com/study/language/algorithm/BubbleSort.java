package com.study.language.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] numbers = {3,2,1,4,5};
//        int[] numbers = {1,3,2,6,7,5,4};
        int[] numbers = {-1,-3,0,0,1};

        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    private static int[] bubbleSort(int[] numbers){
        int size = numbers.length;
        for (int i = 0; i < size; i++){
            boolean isSwap = false;
            for(int j = 0; j < size - 1; j++){
                if (numbers[j] > numbers[j+1]){
                    isSwap = swapNumber(numbers,j);
                }

                if(isSwap){
                    break;
                }
            }
        }
        return numbers;
    }

    private static boolean swapNumber(int[] numbers, int currentIndex){
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[currentIndex+1];
        numbers[currentIndex+1] = temp;
        return true;
    }

}
