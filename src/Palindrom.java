public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom(123321));
    }

    public static boolean isPalindrom(int n) {
        int count = 0;
        int temp = n;

        while (temp >= 1) {
            temp = temp / 10;
            count++;
        }

        int[] arrayOfChars = new int[count];

        for (int i = 0; i < count; i++) {
            arrayOfChars[i] = n % 10;
            n = n / 10;
        }

        boolean isPalindrom = true;

        for (int i = arrayOfChars.length - 1, j = 0; i >= 0; i--, j++) {
            if (arrayOfChars[i] != arrayOfChars[j]) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }
}