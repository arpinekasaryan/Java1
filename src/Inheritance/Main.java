package Inheritance;

public class Main {
    public static void main(String[] args) {


        Phone1 phone1=new Phone1();
        phone1.makinCalls();
        phone1.takinPhoto();
        phone1.keyboard();

        phone1.setTouchScreenTouchScreen(true);
        phone1.setModel("Samsung");
        phone1.setColor("red");
        phone1.setSize("65456 MB");
        phone1.setTouchScreenTouchScreen(true);
        phone1.videoTaking();
        System.out.println(phone1.getModel());
        System.out.println(phone1.getColor());
        System.out.println(phone1.getSize());
        System.out.println(phone1.getIsTouchScreen());





    }
}
