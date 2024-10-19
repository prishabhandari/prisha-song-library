import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        // Variable to store the songs
        ArrayList<Song> songs;

        // Import the songs from the CSV using the SongImporter
        songs = SongImporter.importSongsFromCSV("songs.csv");

        // Loop across all the songs imported
        for (int i = 0; i < songs.size(); i++)
        {
            // Get the current song matching the loop index i
            Song s = songs.get(i);

            // Print the entire song details using the toString() method
            System.out.println(s);  // This automatically calls the toString method of the Song class
            System.out.println("-----------------------------");
        }
    }
}


