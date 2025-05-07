public class App {

    public static void selectionSort(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void main(String[] args) throws Exception {
        int array[] = {6,1,4,3,9,5,7,2,8};

        selectionSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }
}
