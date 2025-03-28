package Polymorphism;
class Vehicle {
    public void move() {
        System.out.println("Phương tiện đang di chuyển...");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Xe hơi chạy bằng động cơ...");
    }
}
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.move();
    }
}
