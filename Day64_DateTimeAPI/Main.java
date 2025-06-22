import java.time.*;
public class Main {
    public static void main(String[] args) {
        ReminderManager manager = new ReminderManager();

        // Add some reminders
        manager.addReminder(new Reminder("Meeting with team", LocalDate.now(), LocalTime.now().minusMinutes(5)));
        manager.addReminder(new Reminder("Lunch break", LocalDate.now(), LocalTime.now().plusMinutes(60)));
        manager.addReminder(new Reminder("Doctor appointment", LocalDate.of(2025, 6, 13), LocalTime.of(9, 0)));

        // Check which reminders are due now
        manager.checkReminders();
    }
}
