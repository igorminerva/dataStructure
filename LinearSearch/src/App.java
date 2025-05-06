public class App {

    private static int linearSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] array = {9, 3, 4, 6, 2, 7, 1, 8, 5};
        int index = linearSearch(array, 1);

        if (index != -1) {
            System.out.println("element found at index: "+index);
        } else {
            System.out.println("element not found");
        }
    }
}
