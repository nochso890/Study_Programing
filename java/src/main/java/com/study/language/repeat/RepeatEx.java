package com.study.language.repeat;

public class RepeatEx {

    public static void main(String[] args) {
        RepeatEx repeatEx = new RepeatEx();

        repeatEx.forEx();
        repeatEx.whileEx();
        repeatEx.doWhileEx();

    }

    public void forEx() {

        int number = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("for문 : " + number++);
        }
    }

    public void whileEx() {

        int number = 0;

        while (number <= 10) {
            number += 1;
            System.out.println("While문 : " + number);
        }
    }

    public void doWhileEx() {

        int number = 0;

        int stopNumber = 10;
        do {
            if (number == 0) {
                System.out.println("먼저 한번 실행되고!" + number);
            } else if (number == 5) {
                System.out.println("오오오오");
            } else {
                continue;
            }
            number++;
        } while (number <= stopNumber);

        System.out.println("끝!");
    }
}
