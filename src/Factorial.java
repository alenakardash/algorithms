public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static long factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
