public class Euler1 {
    public static void main(String[] args) {
        long x = largestPrimeFactor(600851475143L);
        System.out.println(x);
    }
    public static long largestPrimeFactor(long num) {
        long largestFactor = 1;
        long copyOfNum = num;

        while (copyOfNum % 2 == 0) {
            largestFactor = 2;
            copyOfNum /= 2;
        }

        for (int i = 3; i <= Math.sqrt(copyOfNum); i += 2) {
            while (copyOfNum % i == 0) {
                largestFactor = i;
                copyOfNum /= i;
            }
        }

        if (copyOfNum > 2) {
            largestFactor = copyOfNum;
        }

        return largestFactor;
    }
}
// Solution: 6857
