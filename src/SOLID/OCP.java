package SOLID;

// Nguyên tắc Mở đóng (Open-Closed Principle - OCP)
// Phần mềm nên được thiết kế để dễ dàng mở rộng mà không cần thay đổi mã nguồn hiện có.
public class OCP {
    abstract class Shape {
        abstract double area();
    }

    class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        double width, height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double area() {
            return width * height;
        }
    }
}
