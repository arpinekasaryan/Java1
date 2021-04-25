package FilesHomeWork;

import java.util.Scanner;

public class ScannerTut {
    public static void main(String[] args) {


        boolean stop = true;

        Person[] people = new Person[3];

        int i = 0;

        while (stop) {


            Scanner scan = new Scanner(System.in);
            System.out.println("What is your name");
            String name = scan.next();

            System.out.println("What is your LasName");
            String lastName = scan.next();


            System.out.println("What is bearth year");
            int year = scan.nextInt();
            System.out.println("If u are male please write true otherwise write false");
            boolean isMale = scan.nextBoolean();

            System.out.println("what is ur mark ");
            int mark = scan.nextInt();

            Person person = new Person(name, lastName, year, mark, isMale);
            people[i] = person;
            i++;


            System.out.println("for stop write stop");
            String stop1 = scan.next();

            if (stop1.equals("stop")) {

                stop = false;
                System.out.println("The end of the loop Bye Bye!");

            }


        }


        new ReadFile("/Users/arpinekasaryan/Desktop/Myfilik.txt", people);

    }
}






