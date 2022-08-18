import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1970, 10, 30);
        int years = Period.between(birthDate, today).getYears();
        System.out.println("Today's Date is: " + today);
        System.out.println("My BirthDay: " + birthDate);
        System.out.println("My Age is: " + years);
    }
}
