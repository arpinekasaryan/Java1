package FilesHomeWork;

public class Person {
    String name;
    String lastName;
    int year;
    int mark;
    boolean isMale;

    public Person(String name, String lastName, int year, int mark, boolean isMale) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.mark = mark;
        this.isMale=isMale;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", mark=" + mark +
                ", isMale=" + isMale +
                '}';
    }
}
