package SOLID;

// Nguyên tắc thay thế Liskov (Liskov Substitution Principle - LSP)
//  Các đối tượng của lớp con có thể thay thế đối tượng của lớp cha mà không làm thay đổi tính đúng đắn của chương trình.
public class LSP {
    class Bird {
        void fly() {
            // Có thể bay
        }
    }

    class Ostrich extends Bird {
        @Override
        void fly() {
            // Đà điểu không thể bay
        }
    }

}
