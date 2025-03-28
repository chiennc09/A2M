package Abstraction;

abstract class Animal {
    abstract void makeSound(); // Phương thức trừu tượng
    public void sleep() {
        System.out.println("Động vật đang ngủ...");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Mèo kêu: Meo meo!");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();  // Mèo kêu: Meo meo!
        cat.sleep();  // Động vật đang ngủ...
    }
}
