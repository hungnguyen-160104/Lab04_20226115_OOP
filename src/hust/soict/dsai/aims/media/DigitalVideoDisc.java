package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    // Getter cho director
    public String getDirector() {
        return director;
    }

    // Setter cho director
    public void setDirector(String director) {
        this.director = director;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Setter cho length
    public void setLength(int length) {
        this.length = length;
    }

    // Constructor với đầy đủ tham số
    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost); // Gọi constructor của Media
        this.director = director;
        this.length = length;
    }

    // Constructor không có director và length
    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
        this.director = "";  // Đặt giá trị mặc định cho director nếu không có
        this.length = 0;     // Đặt giá trị mặc định cho length nếu không có
    }

    // Constructor chỉ có id và title
    public DigitalVideoDisc(int id, String title) {
        super(id, title, "", 0); // Gọi constructor của Media với giá trị mặc định
        this.director = "";
        this.length = 0;
    }

    // Phương thức toString để hiển thị thông tin của DigitalVideoDisc
    @Override
    public String toString() {
        return "DigitalVideoDisc [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + 
               ", cost=" + getCost() + ", director=" + director + ", length=" + length + "]";
    }
}
