package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();  // Thay đổi thành ArrayList<Media>

    // Thêm một Media vào cửa hàng
    public void addMedia(Media media) {
        itemsInStore.add(media);  // Thêm vào danh sách itemsInStore
        System.out.println(media.getTitle() + " has been added to the store.");
    }

    // Xóa một Media khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);  // Xóa khỏi danh sách itemsInStore
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " was not found in the store.");
        }
    }

    // Hiển thị tất cả các item trong cửa hàng
    public void displayItemsInStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in store: ");
            for (Media media : itemsInStore) {
                System.out.println(media);
            }
        }
    }
}
