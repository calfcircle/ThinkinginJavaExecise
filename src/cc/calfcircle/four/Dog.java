package cc.calfcircle.four;

public class Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(3);
        dog.bark("Woo");
        dog.bark(3, "Woo, woo");
    }

    private void bark(int times) {
        System.out.println("bark " + times + " times");
    }

    private void bark(String msg) {
        System.out.println("bark " + msg + " message");
    }

    private void bark(int times, String msg){
        System.out.println("bark " + times + " times");
        System.out.println("bark " + msg + " message");
    }

}
