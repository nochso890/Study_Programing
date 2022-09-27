package com.study.language.operator;

public class OperatorEx {

    public static void main(String[] args) {
        int i = 5;
        i++;
        System.out.println(i);

        OperatorEx operatorEx = new OperatorEx();
        operatorEx.operatorEx2();
        operatorEx.operatorEx3();

    }

    public void operatorEx2() {
        int i = 5;
        int j;

        j = i++; // 후증가

        System.out.println(i); // 6
        System.out.println(j); // 5

        i = 5;

        j = ++i; //선증가
        System.out.println(i); // 6
        System.out.println(j); // 6
    }

    public void operatorEx3() {
        int a = 10;
        int b = 8;

        System.out.printf("%d 를 %d로 나누면, %n ", a, b);
        System.out.printf("몫은 %d 이고 나머지는 %d 입니다.", 10 / 8, 10 % 8);
    }
}
