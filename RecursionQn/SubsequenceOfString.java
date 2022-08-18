package RecursionQn;

public class SubsequenceOfString {
    public static void main(String[] args) {
        printSubs("ABC", "", 0);
    }

    private static void printSubs(String str, String curr, int index) {
        //base case
        if (index == str.length()) {
            System.out.print(curr + " ");
            return;
        }

        // recursive calls
        printSubs(str, curr, index + 1);
        printSubs(str, curr + str.charAt(index), index + 1);

    }
}
