package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;  // Giả sử chúng ta có đối tượng Book (nếu cần thiết)

public class Aims {
    public static void main(String[] args) {

        // Tạo giỏ hàng
        Cart anOrder = new Cart();

        // Tạo các đối tượng DigitalVideoDisc
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, "Roger Allers", 87);
        anOrder.addMedia(dvd1);  // Thêm vào giỏ hàng

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", 24.95f, "George Lucas", 121);
        anOrder.addMedia(dvd2);  // Thêm vào giỏ hàng

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladdin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);  // Thêm vào giỏ hàng

        // In ra tổng chi phí
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());  // Tính tổng chi phí và in ra
    }
}
