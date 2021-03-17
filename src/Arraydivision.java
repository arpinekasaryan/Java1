public class Arraydivision {
    public static void main(String[] args) {
        int test4[] = new int[15];
        for (int i = 0; i < 15; i++) {
            test4[i]=i+1;


        }
        for (int i = 0; i <15; i++) {
            if (test4[i]%5==0){
                System.out.println(test4[i]);

            }

        }
    }
}
