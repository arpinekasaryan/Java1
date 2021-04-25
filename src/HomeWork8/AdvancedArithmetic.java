package HomeWork8;

import java.util.Arrays;

interface AdvancedArithmetic {
    void divisor_sum(int n);

}

class MyCalculator implements AdvancedArithmetic {
    int sum2 = 0;

    @Override
    public void divisor_sum(int n) {
        try {
            for (int i = 1; i < 1000; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    sum2 = sum2 += i;
                }
            }
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.toString());
        }
        System.out.println("I implemented: AdvancedArithmetic"+ " "+sum2);
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.divisor_sum(6);
    }

}

