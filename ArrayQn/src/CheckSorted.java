public class CheckSorted {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 3, 5};
        int n = array.length;
        if(checkSorted(array, n)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted in increasing order");
        }

    }

    private static boolean checkSorted(int[] array, int n) {
        int i = 0;
        while(i < n - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
