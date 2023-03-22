import java.time.LocalDateTime;
import java.time.Duration;

public class NewBday {
    public static void main(String[] args) {
        int month = 12;
        int day = 9;
        int year = 1990;
        int hour = 23;
        int minute = 23;
        int seconds = 23;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime relTime = LocalDateTime.of(year, month, day, hour, minute, seconds);
        Duration diff = Duration.between(relTime, now);
        System.out.print(relTime + "\n" + now + "\n" + diff.get(TemporalUnit.SECONDS));

    }
}
