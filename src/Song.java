public class Song {
    // Private instance variables to store 10 columns
    private String artistName;
    private String trackName;
    private int releaseYear; // converted releaseDate to year
    private String genre;
    private double duration; // assumed to be song length in minutes
    private String shakeTheAudience;
    private boolean isExplicit; // obscene as a boolean
    private double danceability; // assumed to be a double score
    private double loudness; // assumed to be a double value
    private String topic;

    // Constructor with 10 parameters
    public Song(String artistName, String trackName, int releaseYear, String genre, double duration,
                String shakeTheAudience, boolean isExplicit, double danceability, double loudness, String topic) {
        this.artistName = artistName;
        this.trackName = trackName;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.duration = duration;
        this.shakeTheAudience = shakeTheAudience;
        this.isExplicit = isExplicit;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic;
    }

    // toString method to print song details in a readable format
    @Override
    public String toString() {
        return "Artist: " + artistName + "\n" +
               "Track: " + trackName + "\n" +
               "Release Year: " + releaseYear + "\n" +
               "Genre: " + genre + "\n" +
               "Duration: " + duration + " mins\n" +
               "Shake the Audience: " + shakeTheAudience + "\n" +
               "Explicit: " + (isExplicit ? "Yes" : "No") + "\n" +
               "Danceability: " + danceability + "\n" +
               "Loudness: " + loudness + "\n" +
               "Topic: " + topic + "\n";
    }

    // Getters and Setters (if needed) can be added here
}
