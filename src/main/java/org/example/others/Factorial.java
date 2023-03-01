package org.example.others;

public class Factorial {

    public static int calculate(int number) {
        System.out.println(number);

        if(number == 1)
            return number;

        return number * calculate(number-1);

    }

}
