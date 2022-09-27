package com.study.language.variable;

/*
    클래스의 명명 규칙
    1. 클래스의 이름은 대문자로 시작.
    2. 여러 단어로 이루어진 경우 단어의 첫글자를 대문자.
    3. 상수의 이림은 모두 대문자로 하고, 여러 문자의 경우 '_'로 구분지어준다.

 */
public class VariableEx {

    /*
    변수의 명명 규칙
    1. 대소문자가 구분되며 길이에 제한이 없다.
    2. 예약어를 사용해서는 안된다.
    3. 숫자로 시작해서는 안된다.
    4. 특수문자는 '_'와 '$'만 가능하다.
 */
    public static void main(String[] args) {

        /*
        변수의 타입
        변수타입의 경우 기본형과 참조형으로 분류된다.
        1. primitive Type(기본형)
            - 정수형 : byte, short, int, long
            - 논리형 : boolean
            - 실수형 : float, double
            - 문자형 : char
        2. reference Type(참조형)
            - 위 기본형을 제외한 나머지 값들이며, 객체의 주소를 저장한다.
         */
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2022;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);

        VariableEx variableEx = new VariableEx();

        variableEx.variableSwapEx();
    }


    public void variableSwapEx() {
        int first = 10;
        int second = 20;
        int tmp = 0;

        System.out.println("first : " + first + " second :" + second);

        tmp = first;
        first = second;
        second = tmp;

        System.out.println("first : " + first + " second : " + second);
    }

}
