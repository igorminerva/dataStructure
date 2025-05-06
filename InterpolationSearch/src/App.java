public class App {

    private static int interpolationSearch(int[] array, int value){
        int high = array.length -1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low +(high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe: "+probe);

            if (array[probe] == value) {
                return probe;
            }else if (array[probe]< value) {
                low = probe + 1;
            }else{
                high = probe - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256};

        int index = interpolationSearch(array, 64);
        if (index != -1) {
            System.out.println("element found at index: "+index);
        } else {
            System.out.println("element not found");
        }
    }
}
