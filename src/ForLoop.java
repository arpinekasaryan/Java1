public class ForLoop {
    public static void main(String[] args) {
        int[] intArray1 = new int[]{14, 24, 35};
        String[] cars = {"Sam", "Smith", "David"};

     for (int i =0; i<=10; i++){

         if (intArray1[i] % 2 == 0)
             System.out.println(intArray1[i]);
         else {
             System.out.println("Bye");
         }

     }


    }
}

