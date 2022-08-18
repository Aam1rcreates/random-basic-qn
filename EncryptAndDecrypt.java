import java.util.ArrayList;

public class EncryptAndDecrypt {
    public static void main(String[] args) {
        String text = "Bruce Wayne is Batman!";
        int key = 2;
        System.out.println(text);
        char [] chars = text.toCharArray();
        //char [] encrypted = new char[30];
        for (char c:
             chars) {
            c += key;
            System.out.print(c);
        }
        System.out.println();
        //System.out.println(encrypted);
    }
}
