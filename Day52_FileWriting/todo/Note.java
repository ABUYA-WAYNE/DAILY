// Class to represent a Note object with a title and content
public class Note {
    private final String title;   // Title of the note
    private final String content; // Body/content of the note

    // Constructor to create a new Note with title and content
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Method to format the note as a single line string to be stored in a file
    public String format() {
        return title + ":" + content; // Format: title:content
    }

    // Static method to convert a line from the file back into a Note object
    public static Note fromString(String line) {
        String[] parts = line.split(":", 2); // Split only at the first ":"
        return new Note(parts[0], parts[1]); // Create new Note from the parts
    }

    // Display method to print the note in a readable format
    public void display() {
        System.out.println("[" + title + "] " + content); // e.g., [Shopping] Buy milk
    }
}
