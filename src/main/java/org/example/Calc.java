package org.example;

public class Calc {

    public static int run(String exp) {

        System.out.println("exp1 : " + exp);

        exp = exp.replace("- ", "+ - ");

        System.out.println("exp2 : " + exp);

        String[] bits = exp.split(" \\+ ");

       int sum = 0;
       for (String bit : bits) {
           sum += Integer.parseInt(bit);
       }
       return sum;
//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아님");
    }


}