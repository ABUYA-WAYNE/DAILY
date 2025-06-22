import java.io.*;
import java.util.*;

// Class to handle file operations: saving and loading notes
public class Manager {
    private final String file;

    // Constructor that assigns a default file name
    public Manager() {
        this.file = "notes.txt";
    }

    // Method to save a Note to the file (append mode)
    public void saveNote(Note note) throws IOException {
        // Open file in append mode
        try (FileWriter fw = new FileWriter(file, true) // Open file in append mode
        ) {
            // Open file in append mode
            fw.write(note.format() + "\n"); // Write formatted note
            // Close file
        } // Write formatted note
    }

    // Method to load all notes from the file
    public List<Note> loadNotes() throws IOException {
        List<Note> notes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                notes.add(Note.fromString(line)); // Convert each line to a Note object
            }
            // Close file
        }
        return notes;
    }
}
