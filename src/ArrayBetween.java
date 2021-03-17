public class ArrayBetween {
    public static void main(String[] args) {
        float test5[] = new float[500];
        for (int i = 0; i < 500; i++) {
            test5[i] = i + 1;

        }
        for (int i = 0; i < 500; i++) {
            if (test5[i] > 24.12 && test5[i] < 464.23) {
                System.out.println(test5[i]);
            }
        }

    }
}
