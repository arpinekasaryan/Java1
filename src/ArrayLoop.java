public class ArrayLoop {
    public static void main(String[] args) {
        int[] testArray2;

        testArray2 = new int[1000];


//        int count = 1;
//        for (int i = 0; i < 1000; i++) {
//
//            testArray2[i] = count;
//            count++;

        for (int i = 0; i < 1000; i++) {

            testArray2[i] = i + 1;


        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " : " + testArray2[i]);

        }
    }
}





