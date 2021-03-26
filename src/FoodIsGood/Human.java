package FoodIsGood;

public class Human {
    private String name;
    private int age;
    private boolean isMale;


    public void setData(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.isMale = male;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

}