package WeekFour;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TimeCalculator {

    public void getCurrentLocalDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current Local Date Time:"+ldt);
    }
    public void getZonedLocalDateTime() {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Current Zoned Date Time:"+zdt);
    }
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        TimeCalculator tc = new TimeCalculator();
        tc.getCurrentLocalDateTime();
        tc.getZonedLocalDateTime();
    }
}
