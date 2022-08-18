package RecursionQn;

// A number of people are standing in a circle waiting to be executed.
// Counting begins at a specified point in the circle and proceeds around the circle in a specified direction.
// After a specified number of people are skipped, the next person is executed.
// The procedure is repeated with the remaining people, starting with the next person,
// going in the same direction and skipping the same number of people, until only one person remains, and is freed.

// Time: theta (n)

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(5, 3));
        
        // When index start with 1
        System.out.println(josephus1(5, 3));
    }

    private static int josephus1(int totalParticipants, int pos) {
        // When index start with 1
        return josephus(totalParticipants, pos) + 1;
    }

    private static int josephus(int totalParticipants, int pos) {
        if(totalParticipants == 1)
            return 0;
        else
            return (josephus(totalParticipants-1, pos) + pos) % totalParticipants;
    }
}
