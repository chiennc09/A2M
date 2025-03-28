package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student("Chien", 20);
        System.out.println("Tên: " + s.getName());
        System.out.println("Tuổi: " + s.getAge());
        s.name = "ChienPN";
        System.out.println("Tên mới: "+ s.name);
        s.setAge(25);
        System.out.println("Tuổi mới: " + s.getAge());
    }
}
