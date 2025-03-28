package Abstraction;

interface Flyable {
    void fly();
}
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Chim đang bay...");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();  // Chim đang bay...
    }
}
