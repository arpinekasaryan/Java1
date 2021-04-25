package HomeWork8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println((x / y));

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e.toString());

        }

    }

}

