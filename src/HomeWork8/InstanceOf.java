package HomeWork8;

import java.util.*;


class Student1{}
class Rockstar1{   }
class Hacker1{}


class InstanceOFTutorial{

    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof Student1)
            a++;
            if(element instanceof Rockstar1)
            b++;
            if(element instanceof Hacker1)
            c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        String v = sc.next();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student1"))mylist.add(new Student1());
            if(s.equals("Rockstar1"))mylist.add(new Rockstar1());
            if(s.equals("Hacker1"))mylist.add(new Hacker1());
        }
        System.out.println(count(mylist));
    }
}