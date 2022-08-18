public class SecondLargest {
    public static void main(String[] args) {
        int [] array = {10, 5, 8, 20};
        int [] array2 = {20, 10, 20, 8, 12};
        int [] array3 = {10, 10, 10};

        int index = secondLargest(array3);
        System.out.println(index);
    }

    private static int secondLargest(int[] A) {
        int secondLargest = -1, largest = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] > A[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (A[i] != A[largest]) {
                if ((secondLargest == -1)  || (A[i] > A[secondLargest])) {
                    secondLargest = i;
                }
            }
        }

        return secondLargest;
    }
}


