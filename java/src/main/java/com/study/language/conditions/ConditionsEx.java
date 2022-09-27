package com.study.language.conditions;

public class ConditionsEx {

    public static void main(String[] args) {

        ConditionsEx conditionsEx = new ConditionsEx();

        conditionsEx.ifEx();
        conditionsEx.switchEx();
    }


    public void ifEx() {
        int number = 10;

        if (number == 9) {
            System.out.println("숫자가 9 와 같다.");
        } else if (number == 10) {
            System.out.println("숫자가 10 과 같다.");
        } else {
            System.out.println("숫자가 같은게 없다.");
        }

        String str = "가나다";
        if (str.equals("가나")) {
            System.out.println("문자열이 가나 와 같다.");
        } else {
            System.out.println("이건 아닌거같아");
        }

        if (!str.equals("가나다")) {
            System.out.println("문자열이 가나다 와 다르다.");
        } else {
            System.out.println("문자열이 가나다 와 같다.");
        }
    }

    public void switchEx() {

        String color = "깜장";

        switch (color) {

            case "검정":
                System.out.println("검정이다");
                break;
            case "감장":
                System.out.println("감장이다");
                break;
            case "깜장":
                System.out.println("깜장이다");
                break;
            default:
                System.out.println("무슨색이지?");
                break;
        }

        switch (30) {
            case 13, 12, 15:
                System.out.println("가");
            case 30, 40, 50:
                System.out.println("나");
        }

    }


}
