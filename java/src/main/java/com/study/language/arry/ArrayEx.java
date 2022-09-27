package com.study.language.arry;

public class ArrayEx {

    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5};
        String[] arrayStr = {"가나", "다라", "마다"};

        ArrayEx arrayEx = new ArrayEx();
        arrayEx.showNumberArrayIndex(arrayNumber);

        System.out.println("getNumberArrayLength : " + arrayEx.getNumberArrayLength(arrayNumber));
        System.out.println("getStrArrayLength : " + arrayEx.getStrArrayLength(arrayStr));

    }

    private void showNumberArrayIndex(int[] arrayNumber) {

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Index :" + i);
            System.out.println(i + "번째 값 : " + arrayNumber[i]);
        }

    }

    private int getNumberArrayLength(int[] arrayNumber) {

        return arrayNumber.length;
    }

    private int getStrArrayLength(String[] arrayStr) {

        return arrayStr.length;
    }

}
