package com.study.language.print_ex;

import java.util.logging.Logger;

public class PrintEx_001 {

    public static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';
        String d = "AB";

        System.out.println("b : "+b);
        System.out.println("s : "+s);
        System.out.println("c : "+c);
        System.out.println("d : "+d);

    }

}
