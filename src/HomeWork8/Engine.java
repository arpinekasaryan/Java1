package HomeWork8;

public class Engine {

    void define_me() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}

class Vehicle extends Engine {
    String temp = "a vehicle with pedals.";

    @Override
    void define_me() {
        super.define_me();
        System.out.println("My ancestor is a cycle who is" + temp);

    }

}

class Print {
    public static void main(String[] args) {
        Engine engine1= new Vehicle();
        engine1.define_me();

    }
}
