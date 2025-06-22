import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ReminderManager {
    private ArrayList<Reminder> reminders = new ArrayList<>();

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public void checkReminders() {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.println("Checking reminders at " + now + " on " + today);
        for (Reminder r : reminders) {
            if (r.isDue(today, now)) {
                r.show();
            }
        }
    }
}
