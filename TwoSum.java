public class TwoSum {
    public static void main(String[] args) {
        int [] array = {5, 2, 4};
        int target = 6;
        twoSum(array, target);
    }

    private static void twoSum(int[] array, int target) {
        int [] ans = new int [2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if((array[i] + array[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        printArray(ans);
    }

    private static void printArray(int[] inputArray) {
        for (int j : inputArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
