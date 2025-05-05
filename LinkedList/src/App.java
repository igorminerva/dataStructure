import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        System.out.println(linkedList); //[F, D, C, B, A]
        linkedList.pop();
        System.out.println(linkedList); //[D, C, B, A]

        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");
        System.out.println(linkedList2); //[A, B, C, D, F]
        linkedList2.poll();
        System.out.println(linkedList2); //[B, C, D, F]

        linkedList2.offer("G");
        linkedList2.add(3,"E");
        System.out.println(linkedList2); //[B, C, D, E, F, G]

        System.out.println(linkedList2.indexOf("F")); //4
        System.out.println(linkedList2.peekFirst()); //B
        System.out.println(linkedList2.peekLast()); //G
        linkedList2.addFirst("A");
        System.out.println(linkedList2); //[A, B, C, D, E, F, G]
    }
}
