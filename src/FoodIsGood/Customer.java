package FoodIsGood;

public class Customer {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        human1.setData("Lucifer", 100, true);
        human2.setData("Samael2", 98, false);
        human3.setData("Samael", 2, true);
        Human [] humans={human1,human2,human3};


        PrintData print= new PrintData();
        //print.printHuman(human1);
        print.printSomething(humans);









    }


}
