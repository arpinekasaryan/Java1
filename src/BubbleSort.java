public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }


        }


    }


    public static void printArray(int arr[]) {


        for (int value : arr) {
            System.out.println(value);

        }
        {

        }

    }

    public static void main(String[] args) {
        int[] arr1 = {12, 32, 34, 54, 23, 45};
        bubbleSort(arr1);
        printArray(arr1);
    }
}







