public class CapitalizeTheFirstLetter {
    public static void main(String[] args) {
        String message = "happy birthday";

        String result = message.substring(0,1).toUpperCase() + message.substring(1);
        System.out.println(result);

    }
}
