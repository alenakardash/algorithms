public class SumOfMaximalDigitsFromArray {

    public static void main(String[] args) {
        int[] a = {6, 2, 3, 40, 5, 5, 100};
        System.out.println(sum(findMaxFromArray(a), findEqualOrPreMaxValue(a, findMaxFromArray(a))));
    }

    public static int findMaxFromArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int findEqualOrPreMaxValue(int[] array, int max) {
        int repeat = 0;
        int copyIndex = 0;

        int[] copy = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max && repeat == 0) {
                repeat++;
                continue;
            } else {
                copy[copyIndex] = array[i];
                copyIndex++;
            }
        }

        return findMaxFromArray(copy);
    }

    public static int sum(int... v) {
        int sum = 0;

        for (int x : v) {
            sum += x;
        }
        return sum;
    }
}
