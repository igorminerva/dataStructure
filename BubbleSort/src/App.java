public class App {

    public static void bubbleSort(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i- 1; j++) {
                if (array[j] > array[j+1]) { //change to < for reverse order
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int array[] = {9,1,4,3,6,5,7,2,8};

        bubbleSort(array);

        for(int i : array){
            System.out.print(i);
        }
    }
}
