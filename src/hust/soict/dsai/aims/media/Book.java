package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<>();


    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Thêm tác giả vào danh sách
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) { // Kiểm tra nếu chưa tồn tại
            authors.add(authorName);
            System.out.println("Author \"" + authorName + "\" has been added.");
        } else {
            System.out.println("Author \"" + authorName + "\" already exists.");
        }
    }

    // Xóa tác giả khỏi danh sách
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) { // Kiểm tra nếu tồn tại
            authors.remove(authorName);
            System.out.println("Author \"" + authorName + "\" has been removed.");
        } else {
            System.out.println("Author \"" + authorName + "\" does not exist.");
        }
    }
}
