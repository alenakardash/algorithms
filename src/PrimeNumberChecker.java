public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(13, 2));

    }

    public static boolean isPrime(int n, int rangeNumber) {
        if (n == 2) {
            return true;
        }

        if (n == 1) {
            return false;
        }

        if (rangeNumber == n - 1 && n % rangeNumber != 0) {
            return true;
        }
        if (rangeNumber == n - 1 && n % rangeNumber == 0) {
            return false;
        }

        if (n % rangeNumber == 0) {
            return false;
        } else {
            isPrime(n, rangeNumber + 1);
        }
        return true;
    }
}
