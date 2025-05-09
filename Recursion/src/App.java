public class App {
    private static void walk(int steps){
        //iteration
        //for (int i = 0; i < steps; i++) {
        //    System.out.println("You take a step");
        //}

        //Recursion
        if (steps<1) return; //base case
        System.out.println("You take a step");
        walk(steps - 1);//recursive case
    }

    private static int factorial(int n){
        if (n < 1) return 1;//base case;
         return n * factorial(n - 1); 
    }

    private static int power(int base, int  exp){
        if (exp < 1) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) throws Exception {
        walk(2);
        System.out.println(factorial(7));
        System.out.println(power(5, 2));
    }
}
