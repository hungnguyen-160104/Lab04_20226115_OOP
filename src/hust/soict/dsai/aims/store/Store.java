package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();  // Dùng ArrayList để lưu trữ các đối tượng Media

    // Thêm một Media vào cửa hàng
    public void addMedia(Media media) {
        itemsInStore.add(media);  // Thêm media vào danh sách itemsInStore
        System.out.println(media.getTitle() + " has been added to the store.");
    }

    // Xóa một Media khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);  // Xóa media khỏi danh sách
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
                System.out.println(media);  // Gọi phương thức toString() của đối tượng Media để in ra thông tin
            }
        }
    }

    // Kiểm tra sự tồn tại của một Media trong cửa hàng
    public boolean isMediaInStore(Media media) {
        return itemsInStore.contains(media);  // Kiểm tra xem media có trong cửa hàng hay không
    }

    // Tìm kiếm Media trong cửa hàng theo tiêu đề
    public Media searchMedia(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;  // Trả về media nếu tìm thấy
            }
        }
        return null;  // Trả về null nếu không tìm thấy
    }
}
