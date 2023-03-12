package org.example.others;

public class FizzBuzz {

    /**
     * given 1...100
     * if the number is divisible by 3
     *  print "Fizz"
     * if the number is divisible by 5
     *  print "Buzz"
     * if both are true
     *  print "FizzBuzz"
     */
    public static void run() {
        for(int i = 1; i <= 100; i++) {
            String result = "";
            result += (i % 3 == 0) ? "Fizz" : "";
            result += (i % 5 == 0) ? "Buzz" : "";

            if(!result.isBlank())
                System.out.println(result);
            else
                System.out.println(i);
        }
    }

}
