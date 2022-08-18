// indexes of the element of the max contiguous sum sub array
public class KandanesAlgorithm2 {
    public static void main(String[] args) {
        int [] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int size = array.length;

        maxSumSubArrayIndexes(array, size);
    }

    private static void maxSumSubArrayIndexes(int[] array, int size) {
        int maxSoFar = Integer.MIN_VALUE;
        int current_max = 0;
        int start = 0, end = 0, s = 0;

        for (int i = 0; i < size; i++) {
            current_max += array[i];

            if(current_max > maxSoFar) {
                maxSoFar = current_max;
                start = s;
                end = i;
            }

            if (current_max < 0) {
                current_max = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous Sum when sum > 0 is: " + maxSoFar);
        System.out.println("Starting Index: " + start);
        System.out.println("Ending Index: " + end);
    }
}
