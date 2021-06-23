public class MaxSumFromArrayCounter {
    public static void main(String[] args) {
        int[] arr = {100, 2, 1};

        int[] arrayMaxNumbers = getTwoMax(arr);
        System.out.println(sum(arrayMaxNumbers));
    }

    public static int sum(int... v) {
        int sum = 0;

        for (int x : v) {
            sum += x;
        }
        return sum;
    }

    public static int[] getTwoMax(int[] array) {
        int max1 = array[0];
        int max2 = array[1];

        if (max2 > max1) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else {
                if (array[i] > max2) {
                    max2 = array[i];
                }
            }
        }
        return new int[]{max1, max2};
    }
}
