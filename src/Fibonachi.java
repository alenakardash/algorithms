public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi(7));

    }

    public static long fibonachi(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);


    }
}
