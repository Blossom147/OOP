package Inheritance;

public class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}