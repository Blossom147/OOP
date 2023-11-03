package Interface;

// Dùng interface khi muốn đa kế thừa
// Lập giao thức chung giữa các lớp không có mối liên hệ

public interface Drawable {
    void draw(); // Phương thức trừu tượng draw
}

// Lớp hình tròn triển khai giao diện "Drawable"
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Lớp hình chữ nhật triển khai giao diện "Drawable"
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

 class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw(); // Kết quả: Drawing a circle
        rectangle.draw(); // Kết quả: Drawing a rectangle
    }
}