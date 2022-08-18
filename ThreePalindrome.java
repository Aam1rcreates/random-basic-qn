import java.util.Scanner;

public class ThreePalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        solve(input);
    }

    private static void solve(int input) {
        String ans = "";
        for(int i = 0; i < input; i++){
            ans += "aa";
            ans += "bb";
        }
        System.out.println(ans.substring(0,input));
    }
}
