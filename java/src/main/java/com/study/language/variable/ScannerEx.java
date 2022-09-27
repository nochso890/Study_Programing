package com.study.language.variable;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 입력해주세요");
        String inputNumber = scanner.nextLine();
        int number = Integer.parseInt(inputNumber);

        System.out.println("입력내용 : " + number);
    }

}
