public class StringMethods {
    public static void main(String[] args) {

        // Finding substring
        String s1 = "That's what she said";
        System.out.println(s1.substring(7));
        System.out.println(s1.substring(0,6));

        // Concatenates
        String s2 = "avada";
        String s3 = s2.concat("kedavra");
        System.out.println(s3);

        //Replace character - replaces all the occurrences of a character with the new character.
        String s4 = "Freak";
        String s5 = s4.replace('F', 'B');
        System.out.println(s5);

        // strip() --> getting rid of extra spaces
        String s6 = "  Baby  ";
        System.out.println(s6.strip());
        System.out.println(s6.stripTrailing());

        // Case Changing
        String s8 = "jim";
        String s9 = "JaM";
        System.out.println(s8.toUpperCase());
        System.out.println(s9.toLowerCase());

        // joining strings
        String s10 = String.join(" | ", "I", "am", "inevitable");
        System.out.println(s10);

    }
}
