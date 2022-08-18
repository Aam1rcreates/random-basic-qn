package RecursionQn;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 253;
        System.out.println(sumOfDigit(n));
    }

    private static int sumOfDigit(int n) {
        if(n < 10)
            return n;
        return sumOfDigit(n/10) + (n % 10);
    }
}
