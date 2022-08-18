public class KandanesAlgorithm3 {
    public static void main(String[] args) {
        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3 };

        int max = maximumContiguousSubArraySum(array, array.length);

        System.out.println("Maximum Contiguous Sub-array Sum is: " + max);
    }

    private static int maximumContiguousSubArraySum(int[] A, int length) {
        int maxSoFar = A[0];
        int current_max = A[0];

        for (int i = 0; i < length; i++) {
            current_max = Math.max(A[i], current_max+A[i]);
            maxSoFar = Math.max(current_max, maxSoFar);
        }
        return maxSoFar;
    }
}
