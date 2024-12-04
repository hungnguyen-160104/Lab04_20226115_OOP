package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    // Dùng ArrayList<Media> để chứa các đối tượng Media
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // Phương thức thêm Media vào giỏ hàng
    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println(media.getTitle() + " has been added to the cart.");
    }

    // Phương thức xóa Media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println(media.getTitle() + " is not in the cart.");
        }
    }

    // Phương thức tính tổng giá trị của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Phương thức hiển thị giỏ hàng
    public void displayCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Media media : itemsOrdered) {
                System.out.println(media);
            }
        }
    }
}
