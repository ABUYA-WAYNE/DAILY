import java.time.*;

public class Reminder {
    private String message;
    private LocalDate date;
    private LocalTime time;

    public Reminder(String message, LocalDate date, LocalTime time) {
        this.message = message;
        this.date = date;
        this.time = time;
    }

    public boolean isDue(LocalDate today, LocalTime now) {
        return date.equals(today) && !time.isAfter(now); // due if today and time has passed
    }

    public void show() {
        System.out.println("🔔 Reminder: " + message + " at " + time + " on " + date);
    }
}
