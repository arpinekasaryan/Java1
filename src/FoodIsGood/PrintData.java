package FoodIsGood;

public class PrintData {
    public void printHuman(Human data){


        System.out.println(data.getName()+"\n"+ data.getAge() + "\n"+ data.isMale());

    }

    public void printSomething( Human arrayy[]){


        for (Human val:arrayy) {
            System.out.println(val.getName()+"\n"+ val.getAge()+"\n"+val.isMale()+"\n");
        }

    }
}
