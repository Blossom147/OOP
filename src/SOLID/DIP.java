package SOLID;

// Nguyên tắc Phụ thuộc nghịch đảo (Dependency Inversion Principle - DIP)
// Các lớp cụ thể không nên phụ thuộc vào các lớp cụ thể khác, mà nên phụ thuộc vào các giao diện hoặc lớp trừu tượng.

public class DIP {

    class LightBulb {
        void turnOn() {
            // Bật đèn
        }

        void turnOff() {
            // Tắt đèn
        }
    }

    class Switch {
        LightBulb bulb;

        Switch(LightBulb bulb) {
            this.bulb = bulb;
        }

        void operate() {
            // Phụ thuộc vào giao diện, không phụ thuộc vào lớp cụ thể
            bulb.turnOn();
            bulb.turnOff();
        }
    }

}
