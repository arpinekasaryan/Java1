public class ArrayDivided2 {

    public static void main(String[] args) {
        int test4[] = new int[15];
        for (int i = 0; i < 15; i++) {
            test4[i] = i + 1;


        }
        for (int i = 0; i < 15; i++) {
            if (test4[i] % 2 == 0) {
                System.out.println(test4[i]);

            }

        }
    }
}

