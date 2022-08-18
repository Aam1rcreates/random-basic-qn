package RecursionQn;

// time: 2^n

public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3, 1, 2,3);
    }

    private static void TOH(int n, int A, int B, int C){
        if (n > 0) {
            // from A to B using auxiliary tower C
            TOH(n-1, A, C, B);
            System.out.println("Move a disc from " + A + " to " + C);

            // from tower B to C using auxiliary tower C
            TOH(n-1, B, A, C);

        }
    }
}
