import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty()); //true

        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Marius");
        queue.offer("Joe");
        System.out.println(queue.isEmpty()); //false
        System.out.println(queue.size()); //4
        System.out.println(queue.contains("Joe")); //true
        System.out.println(queue.peek()); //Karen
        System.out.println(queue); //[Karen, Steve, Marius, Joe]

        queue.poll();
        queue.poll();
        System.out.println(queue.peek()); //Marius
        System.out.println(queue); //[Marius, Joe]

    }
}
