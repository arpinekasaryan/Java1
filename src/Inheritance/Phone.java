package Inheritance;

public class Phone {
    private String color;
    private String model;
    private String size;

    public void setColor(String color){
        this.color=color;


    }
    public void setModel(String model){
        this.model=model;
    }
    public void setSize(String size){
        this.model=size;
    }
    public String getSize()
    {
        return size;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }




    public static void keyboard(){
        System.out.println("typing on keboard");
    }
    public static void makinCalls(){
        System.out.println("Calls to other people");
    }
    public static void takinPhoto(){
        System.out.println("take photo");
    }

}
