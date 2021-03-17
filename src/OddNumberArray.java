public class OddNumberArray {
    public static void main(String[] args) {
        int test3[] = new int[41];
        for (int i = 0; i < 41; i++) {
            test3[i] = i - 20;


        }
        for (int i = 0; i < 41; i++) {
            System.out.println(i + " : " + test3[i]);

        }

    }
}
