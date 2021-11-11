public class Song {

    private String title;
    private String artist;
    private String genre;
    private String year;
    private String path;
    
    public Song(String title, String artist, String genre, String year, String path) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return title + " (Artist: " + artist + ", Year: " + year 
        + ", Genre: " + genre + ", File Path: " + path + ")";
    }

}
