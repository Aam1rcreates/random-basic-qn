package RecursionQn;

public class CombinationNCR {
    public static void main(String[] args) {
        //System.out.println(nCrRecursion(5, 2));

        System.out.println(nCr(5, 2));
    }

    private static int nCr(int n, int r) {
        int num = fact(n);
        int deno = fact(n - r) * fact(r);

        return num/deno;
    }

    private static int fact(int n) {
        if(n == 0)
            return 1;

        return fact(n-1) * n;
    }

    private static int nCrRecursion(int n, int r) {
        if( r == n || r == 0)
            return 1;

        return nCrRecursion(n - 1, r - 1) + nCrRecursion(n - 1, r);
    }
}
