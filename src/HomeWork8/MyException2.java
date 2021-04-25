package HomeWork8;

import java.util.Scanner;

public class MyException2 extends Exception {
    String message;

    public MyException2(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner= new Scanner(System.in);
            double x= scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.println(calclulate(x,y));
        } catch (MyException2 e){
            System.out.println(e.toString());
        }

    }
        public static double calclulate ( double a, double b) throws MyException2 {
            if (a == 0 | b == 0) {
                throw new MyException2("n and p should not be zero.");
            }
            else if (a<0 |b<0){
                throw new MyException2("n and p should not be negative.");
            }
            return Math.pow(a, b);

        }


    }

