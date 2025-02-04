import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysSince1970 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DaysSince1970 DD MM YYYY");
            return;
        }

        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        LocalDate date = LocalDate.of(y, m, d);
        LocalDate ref = LocalDate.of(1970, 1, 1);
        long days = ChronoUnit.DAYS.between(ref, date);

        System.out.println("Days since 1 Jan 1970: " + days);
    }
}
