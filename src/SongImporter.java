import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class SongImporter {
    public static ArrayList<Song> importSongsFromCSV(String filename) {
        ArrayList<Song> songs = new ArrayList<Song>();
        int lineNumber = 0;

        try {
            // Create a File object from the filename
            File file = new File(filename);

            // Create a Scanner object to read from the file
            Scanner csv = new Scanner(file);

            // Check if the file has any content
            if (!csv.hasNextLine()) {
                System.out.println("The file is empty.");
                csv.close();
                return songs; // Return an empty list if no content
            }

            // First line is the header, we print it out for reference
            String headerFields = csv.nextLine();
            System.out.println("Header fields: " + headerFields);

            // Loop through the CSV file, line by line
            while (csv.hasNextLine()) {
                lineNumber++; // Track the line number to handle errors

                // Optional: limit to 30 lines for testing
                if (lineNumber > 30) {
                    break;
                }

                // Read a line and split it into fields
                String line = csv.nextLine();
                String[] fields = line.split(",");

                // Parse the fields correctly for the constructor
                String artistName = fields[0];
                String trackName = fields[1];
                int releaseYear = Integer.parseInt(fields[2]); // Parse as integer
                String genre = fields[3];
                double duration = Double.parseDouble(fields[4]); // Parse as double
                String shakeTheAudience = fields[5];
                boolean isExplicit = Boolean.parseBoolean(fields[6]); // Parse as boolean
                double danceability = Double.parseDouble(fields[7]); // Parse as double
                double loudness = Double.parseDouble(fields[8]); // Parse as double
                String topic = fields[9];

                // Create a new Song object with all parsed data
                Song song = new Song(artistName, trackName, releaseYear, genre, duration,
                                     shakeTheAudience, isExplicit, danceability, loudness, topic);

                // Add the song object to the list
                songs.add(song);
            }
            csv.close();
        } catch (Exception ex) {
            // Handle errors
            System.out.println("Error on line: " + lineNumber);
            ex.printStackTrace();
        }
        return songs;
    }
}
