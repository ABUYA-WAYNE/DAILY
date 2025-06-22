// Main app class to demonstrate saving and loading notes

public class App {

    public static void main(String[] args) throws Exception {
        Manager manager = new Manager(); // Create manager to handle note operations

        // Save two notes to the file
        manager.saveNote(new Note("Shopping", "Buy milk and eggs"));
        manager.saveNote(new Note("Reminder", "Call mum"));
        System.out.println("ghjk");
        // Print all the notes that have been saved
        System.out.println("All notes:");
        for (Note note : manager.loadNotes()) { // Load all notes and loop through them
            note.display(); // Print each note
        }
    }
}
