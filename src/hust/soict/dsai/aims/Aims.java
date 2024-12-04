package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void main(String[] args) {

        // Tạo cửa hàng
        Store aStore = new Store();

        // Tạo các đối tượng DigitalVideoDisc, CompactDisc và Book
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, "Roger Allers", 87);
        CompactDisc cd1 = new CompactDisc(2, "Abbey Road", "Music", 24.95f, 47, "George Martin", "The Beatles");
        Book book1 = new Book(3, "Harry Potter", "Fantasy", 29.99f);

        // Thêm các sản phẩm vào cửa hàng
        aStore.addMedia(dvd1);
        aStore.addMedia(cd1);
        aStore.addMedia(book1);

        // Hiển thị các sản phẩm trong cửa hàng
        aStore.displayItemsInStore();

        // Xóa một sản phẩm khỏi cửa hàng
        aStore.removeMedia(dvd1);

        // Hiển thị lại các sản phẩm sau khi xóa
        aStore.displayItemsInStore();
    }
}
