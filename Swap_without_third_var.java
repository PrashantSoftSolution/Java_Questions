public class Swap_without_third_var {
    public static void main(String[] args) {
        int a=20;
        int b=10;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a + " "+ " " + b );
    }
    
}
