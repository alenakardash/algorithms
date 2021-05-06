public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi(7));
    }

    public static long fibonachi(int n) {
        return n <= 1 ? n : fibonachi(n - 1) + fibonachi(n - 2);
    }
}
