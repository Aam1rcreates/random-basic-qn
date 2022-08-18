// Hash Map
// 0(n)

/*
Map is basically collection of {key, value} pair
Hash Map
we add some searching key.. and then we add some value to that key
then, later on when we give some certain key.. the map retrieve us the value
they have stored for that key.. and does all these work in constant time i.e,
0(1)
Map gives
 Key             -->  Value
 target - arr[i]  -->   i
 1       -->  0
 (6 - 5)

 2      -->   1
 (6 - 4)

 4       -->  2


 */

import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {
    public static void main(String[] args) {
        int [] array = {5, 2, 4};
        int target = 6;
        twoSum(array, target);
    }

    private static void twoSum(int[] array, int target) {
        int [] ans = new int[2];
        Map<Integer, Integer> compliments = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            // creating and adding Value to Key
            Integer complimentIndex = compliments.get(array[i]);
            // checking if that required value already exist
            if (complimentIndex != null) {
                ans[0] = i;
                ans[1] = complimentIndex;
            }
            compliments.put(target - array[i], i);
        }
        printArray(ans);
    }

    private static void printArray(int[] inputArray) {
        for(int i : inputArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}




















































