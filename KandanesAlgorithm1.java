// best algo for finding contiguous max sum sub array
// time complexity: 0(n) --> linear time
// space complexity: 0(1) --> constant/ no extra space is needed
// when sum > 0
public class KandanesAlgorithm1 {
    public static void main(String[] args) {

        int [] array = {-2, -3, 4, -1, -2, 1, 5, -3 };

        int max = maximumContiguousSubArraySum(array);

        System.out.println("Maximum Contiguous Sub-array Sum when sum > 0 is: " + max);
    }

    private static int maximumContiguousSubArraySum(int[] array) {
        int maxSoFar = Integer.MIN_VALUE;
        int max_current = 0;

        for (int i = 0; i < array.length; i++) {
            max_current += array[i];

            if(max_current > maxSoFar) {
                maxSoFar = max_current;
            }

            if(max_current < 0) {
                max_current = 0;
            }
        }

        return maxSoFar;
    }
}
