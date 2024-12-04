package hust.soict.dsai.aims.media;

public class Track {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter cho title
    public String getTitle() {
        return title;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", length=" + length + "]";
    }
}
