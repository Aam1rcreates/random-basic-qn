// time complexity of this algorithm is as same as merge sort i.e, 0(n * log n)
// Divide & Conquer algorithm

public class MaximumSubArraySumDAndC {
    public static void main(String[] args) {
        int [] arr = {-1, 7, 3,-6, 3, -2, -7, 12};
        int N = arr.length;
        int maxSum = maximumSubArraySum(arr,0, N-1);

        System.out.println("Maximum contiguous sum is: " + maxSum);

    }

    private static int maximumSubArraySum(int[] inputArray, int left, int right) {
        //invalid range
        if(left > right)
            return Integer.MAX_VALUE;

        // Base case: when there's only 1 element
        if(left == right)
            return inputArray[left];

        int middle = (left + right) / 2;

        /*
        Return maximum of 3 of the following possible cases:
            1. Maximum sub-array sum in left half.
            2. Maximum sub-array sum in right half.
            3. Maximum sub-array sum such that the sub-array crosses the midpoint.
         */
        return Math.max(Math.max(maximumSubArraySum(inputArray,left,middle), maximumSubArraySum(inputArray,middle+1,right)),
                        maxCrossingSum(inputArray,left,middle,right));
    }

    private static int maxCrossingSum(int[] inputArray, int left, int middle, int right) {
        //includes elements on left of middle.
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = middle; i >= left; i--) {
            sum += inputArray[i];

            if(sum > leftSum)
                leftSum = sum;
        }

        // includes elements from middle to right end
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = middle; i <= right; i++) {
            sum += inputArray[i];

            if(sum > rightSum)
                rightSum = sum;
        }

        // Since inputArray[middle] is already added twice i.e,in rightSum and leftSum. So, it is subtracted 1 time.
        return Math.max(leftSum + rightSum - inputArray[middle], Math.max(leftSum, rightSum));
    }


}
