public class App {
    public static void isertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;

            while (j>=0 && array[j]>temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public static void main(String[] args) throws Exception {
        int array[] = {9, 1, 8, 3, 2, 5, 6, 4, 7};

        isertionSort(array);

        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
