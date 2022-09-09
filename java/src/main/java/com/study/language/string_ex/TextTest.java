package com.study.language.string_ex;

import java.util.Arrays;

public class TextTest {

    public static void main(String[] args) {
        var text = "식별코드\t9\tX\t○\n"
            + "업체번호\t12\tX\t○\n"
            + "은행코드\t2\t9\t○\n"
            + "전문구분코드\t4\tX\t○\n"
            + "업무구분코드\t3\tX\t○\n"
            + "송신회수\t1\t9\t○\n"
            + "전문번호\t6\t9\t\n"
            + "전송일자\t8\t9\t○\n"
            + "전송시간\t6\t9\t○\n"
            + "응답코드\t4\tX\t\n"
            + "식별코드(송신자)\t9\tX\t○\n"
            + "삼성SDS영역\t15\tX\t\n"
            + "업체영역\t11\tX\t\n"
            + "은행영역*\t10\tX\t";

        for (String s : text.split("\n")) {
            var str = "";
            var temp = "";
            var split = s.split("\t");
            for (int i = 0; i < split.length; i++) {

                str += switch (i) {
                    case 0 -> " new FirmTransaction(\"" + split[i] + "\", ";
//                    case 1 ->  split[i] + ", ";
                    case 2 ->  "Type.LEFT, "+temp;
                    case 3 ->  " true";
                    default -> "";
                };

                if(i == 1){
                    temp = split[i] + ", ";
                }else{
                    temp = "";
                }

            }
            if(split.length != 4){
                str += " false";
            }
            str += "),";
            System.out.println(str);
        }

    }

    //new FirmTransaction("가상계좌번호", Type.LEFT, 16, false),

}
