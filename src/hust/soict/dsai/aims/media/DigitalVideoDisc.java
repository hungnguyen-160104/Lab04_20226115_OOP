package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public DigitalVideoDisc(int id, String title) {
        super(id, title, null, 0); 
    }


    public String toString() {
        return "DigitalVideoDisc [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + 
                ", cost=" + getCost() + ", director=" + director + ", length=" + length + "]";
    }
}
