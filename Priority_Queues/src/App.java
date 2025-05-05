import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new PriorityQueue<>(); //Collection.reverseOrder() to reverse the order of priority

        queue.offer("C");
        queue.offer("D");
        queue.offer("A");
        queue.offer("B");
        queue.offer("F");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //A B C D F
            
        }
    }
}
