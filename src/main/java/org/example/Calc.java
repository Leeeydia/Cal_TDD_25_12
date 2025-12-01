package org.example;

public class Calc {

    public static int run(String exp) {

        System.out.println("exp1 : " + exp);

        exp = exp.replace("- ", "+ -");

        System.out.println("exp2 : " + exp);

        String[] bits = exp.split(" \\+ ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);
        int c = 0;

        if (bits.length > 2) {
            c = Integer.parseInt(bits[2]);
        }

        return a + b + c;


//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아님");
    }


}