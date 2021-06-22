import java.util.Arrays;

public class MaxSumFromArrayCounter {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 2, 8, 9, 12};

        sortArrayDesc(arr);
        int[] res = getMaxValuesFromArray(arr, 4);
        showArrayValues(res);
        System.out.println(sum(res));
    }

    public static void sortArrayDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int[] getMaxValuesFromArray(int[] array, int count) {
        int[] arrayWithMaxValues = Arrays.copyOf(array, count);
        return arrayWithMaxValues;
    }

    public static void showArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int sum(int... v) {
        int sum = 0;

        for (int x : v) {
            sum += x;
        }
        return sum;
    }
}
