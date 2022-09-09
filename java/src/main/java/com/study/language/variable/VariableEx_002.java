package com.study.language.variable;

public class VariableEx_002 {

    public static void main(String[] args){
        int first = 10;
        int second = 20;
        int tmp = 0;

        System.out.println("first : "+ first + " second :"+ second);

        tmp = first;
        first = second;
        second = tmp;

        System.out.println("first : "+ first + " second : "+second);

    }

}
