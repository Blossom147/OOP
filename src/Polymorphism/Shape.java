package Polymorphism;

public class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}