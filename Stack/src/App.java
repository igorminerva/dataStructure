import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("FF7");
        System.out.println(stack.empty());

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("FF7"));
        System.out.println(stack.search("Minecraft"));

        String game = stack.pop();
        System.out.println(stack);
        System.out.println(game);
        System.out.println(stack.peek());

        
        
    }
}
