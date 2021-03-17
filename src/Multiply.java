public class Multiply {
    public static void main(String[] args) {
        int[] test7 = new int[20];
        for (int i = 0; i < 20; i++) {
            test7[i] = i + 1;


        }
        for (int i = 0; i < 20; i++) {

            System.out.println("");
            System.out.println(test7[i]+"===============");
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.println(test7[i] + " X " + j + " = " + (test7[i] * j));

            }
        }

    }
}
