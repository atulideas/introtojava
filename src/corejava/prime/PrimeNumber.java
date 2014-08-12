package corejava.prime;

/**
 * A program to find the largest prime number in the range lowerBound to upperBound
 * 
 * @author idnatj
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int lowerBound = 1;
        int upperBound = 1000000000;
        boolean isPrime = true;
        for (int i = upperBound; i >= lowerBound; i--) {
            for (int j = 2; j <= (i / 2); j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is the largest prime number in the range " + lowerBound + " - " + upperBound);
                break;
            } else {
                isPrime = true; // reset to default
                continue;
            }
        }
    }
}
