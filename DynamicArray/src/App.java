

public class App {
    public static void main(String[] args) throws Exception {
        
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("F");
        dynamicArray.add("G");

        dynamicArray.insert(1, "X");
        dynamicArray.delete("C");
        dynamicArray.delete("F");
        dynamicArray.delete("A");
        dynamicArray.delete("X");
        System.out.println(dynamicArray.search("B"));
        System.out.println(dynamicArray.search("C"));
        System.out.println("empty: "+dynamicArray.isEmpty());
        System.out.println("size: "+dynamicArray.size);
        System.out.println("capacity: "+dynamicArray.capacity);
        System.out.println(dynamicArray);
    }
}
