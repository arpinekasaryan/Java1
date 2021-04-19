package FilesHomeWork;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class ReadFile {

    public ReadFile() {
    }

    public ReadFile(String myFile, Person[] people) {
        try {
            File file = new File(myFile);
            FileWriter myWriter = new FileWriter(file);


            for (Person person : people) {

                myWriter.write(person.toString());
                myWriter.close();
            }
            Scanner myReader = new Scanner(file);
            String data = myReader.nextLine();
            System.out.println(data);

        } catch (Exception e) {
            System.out.println(e);
        }

        int minMark = people[0].mark;
        int minYear = people[0].year;
        int[] arr = new int[people.length];

        for (int i = 0; i < people.length; i++) {


            if (people[i].mark < minMark) {
                minMark = people[i].mark;
            }

            if (people[i].year < minYear) {
                minYear = people[i].year;
            }

            if (people[i].isMale) {
                System.out.println("Here are the male persons:" + " " + people[i].name + " " + people[i].lastName);
            }

            if (!people[i].isMale && people[i].mark > 50.4) {
                System.out.println("Female and more than 50.4:" + " " + people[i].name + " " + people[i].lastName + " " + people[i].mark);
            }

            arr[i] = people[i].mark;

        }

        Arrays.sort(arr);
        System.out.println("Marks sorted:" + " " + Arrays.toString(arr));
        System.out.println("The person with minimal marsk is:" + " " + minMark);
        System.out.println("Min year student is:" + " " + minYear);


    }

}