package Polymorphism;
class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(5, 10));
        System.out.println(math.add(5, 10, 20));
    }
}
