package HomeWork8;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

 class MyBook extends Book{
    @Override
    void setTitle(String s) {
        System.out.println(s);

    }

    public static void main(String[] args) {
        MyBook myBook= new MyBook();
        myBook.setTitle("A title is:"+" "+ "A tale of two cities");

    }
}
