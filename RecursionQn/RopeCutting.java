package RecursionQn;

public class RopeCutting {
    public static void main(String[] args) {
        int ropeSize = 5, a = 4, b = 2, c = 1;
        int noOfRopes = maxCuts(ropeSize, a, b, c);
        System.out.println(noOfRopes);
    }

    private static int maxCuts(int n, int a, int b, int c) {
        //base cases
        if( n == 0)
            return 0;
        if (n < 0)
            return -1;

        //recursion calls
        int result = Math.max(maxCuts(n-a, a, b, c),
                Math.max(maxCuts(n-b, a, b, c), maxCuts(n-c, a, b, c)));
        if (result == -1)
            return -1;
        return (result+1);
    }
}
