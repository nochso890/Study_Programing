package com.study.language.arry;

public class ArrayEx {

    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5};
        String[] arrayStr = {"가나", "다라", "마다"};

        ArrayEx arrayEx = new ArrayEx();
        arrayEx.showNumberArrayIndex(arrayNumber);

        System.out.println("getNumberArrayLength : " + arrayEx.getNumberArrayLength(arrayNumber));
        System.out.println("getStrArrayLength : " + arrayEx.getStrArrayLength(arrayStr));
        arrayEx.arrayCopy();
        arrayEx.shuffleArray();

    }

    private void showNumberArrayIndex(int[] arrayNumber) {

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Index :" + i);
            System.out.println(i + "번째 값 : " + arrayNumber[i]);
        }

    }

    private void arrayCopy(){
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5'};
        char[] tmp = new char[abc.length + num.length];

        System.arraycopy(abc,0,tmp,0,abc.length);
        System.arraycopy(num,0,tmp,abc.length,num.length);
        System.out.println(tmp);
    }

    private void shuffleArray(){

        int[] numArray = new int[10];

        for(int i=0; i < numArray.length; i++){
            numArray[i] = i;
            System.out.println(numArray[i]);
        }

        System.out.println("=================");

        for(int i=0; i < 11; i++){
            int n = (int) (Math.random() * 10);
            System.out.println("N : "+ n);
            int tmp = numArray[0];
            numArray[0] = numArray[n];
            numArray[n] = tmp;
        }

        for(int i=0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }

    }

    private int getNumberArrayLength(int[] arrayNumber) {

        return arrayNumber.length;
    }

    private int getStrArrayLength(String[] arrayStr) {

        return arrayStr.length;
    }

}
